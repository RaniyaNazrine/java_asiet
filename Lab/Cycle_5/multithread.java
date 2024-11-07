import java.util.Random;
class RandomNumberGenerator extends Thread {
    int randomNumber;
    Thread evenThread, oddThread;

    RandomNumberGenerator(Thread evenThread, Thread oddThread) {
        this.evenThread = evenThread;
        this.oddThread = oddThread;
    }

    public void run() {
        Random random = new Random();
        while (true) {
            randomNumber = random.nextInt(100);
            System.out.println("Generated Number: " + randomNumber);

            if (randomNumber % 2 == 0) synchronized (this) { evenThread.notify(); }
            else synchronized (this) { oddThread.notify(); }

            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class EvenThread extends Thread {
    RandomNumberGenerator generator;

    EvenThread(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    public void run() {
        while (true) {
            synchronized (generator) {
                try { generator.wait(); }
                catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Even Thread: Square of " + generator.randomNumber + " is " + generator.randomNumber * generator.randomNumber);
            }
        }
    }
}

class OddThread extends Thread {
    RandomNumberGenerator generator;

    OddThread(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    public void run() {
        while (true) {
            synchronized (generator) {
                try { generator.wait(); }
                catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Odd Thread: Cube of " + generator.randomNumber + " is " + generator.randomNumber * generator.randomNumber * generator.randomNumber);
            }
        }
    }
}
class MultiThread
{
    public static void main(String[] args)
    {
        RandomNumberGenerator randomThread = new RandomNumberGenerator(null, null);
        EvenThread evenThread = new EvenThread(randomThread);
        OddThread oddThread = new OddThread(randomThread);
        randomThread = new RandomNumberGenerator(evenThread, oddThread);
        randomThread.start();
        evenThread.start();
        oddThread.start();
    }
}

