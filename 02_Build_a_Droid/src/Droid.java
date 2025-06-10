public class Droid
{
    int batteryLevel;
    String name;

    public Droid(String droidName)
    {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString()
    {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task)
    {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport()
    {
        System.out.println(batteryLevel);
    }

    public void energyTransfer(Droid targetDroid, int energy)
    {
        this.batteryLevel -= energy;
        targetDroid.batteryLevel += energy;

        System.out.println(this.name + " transfer " + energy + " energy to " + targetDroid.name);
        System.out.println(this.name + " has " + this.batteryLevel + " energy");
        System.out.println(targetDroid.name + " has " + targetDroid.batteryLevel + " energy");
    }

    public static void main(String[] args)
    {
        Droid codey= new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dance");
        codey.performTask("Work");
        codey.energyReport();

        Droid mike = new Droid("Mike");
        mike.energyTransfer(codey, 10);
    }
}
