public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight; 
    private int IQ;
    private String birthDate;
    private boolean isFemale;
    
    public Person()
    {
        firstName = "Sam";
        lastName = "Java";
        age = 21;
        height = 66.0;
        weight = 175.0;
        IQ = 100; 
        birthDate = "07-31-2000";
        if (Math.random() > 0.5)
            isFemale = false;
        else
            isFemale = true;
    }
    public Person(String firstName, String lastName, int age, double height, double weight, int IQ, String birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.IQ = IQ; 
        this.birthDate = birthDate;
        if (Math.random() > 0.5)
            isFemale = false;
        else
            isFemale = true;
    }

        public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public int getIQ()
    {
        return this.IQ;
    }
    public String getBirthDate()
    {
        return this.birthDate;
    }
    public boolean isPersonFemale()
    {
        return this.isFemale;
    }
    public void lernStuf()
    {
        this.IQ = this.IQ + 1;
    }
    public void sniffMarker(int howLong)
    {
        this.IQ = this.IQ - (int)(howLong * 1.02);
    }
    public void printPersonalReport()
    {
        System.out.println("Name:" + " " + firstName + " " + lastName);
        System.out.println("Age:" + " " + age);
        System.out.println("Height:" + " " + height);
        System.out.println("Weight:" + " " + weight);
        System.out.println("IQ:" + " " + IQ);
        System.out.println("Birthdate:" + " " + birthDate);
        if (!isFemale) {
            System.out.println("The person is male.");
        } else {
            System.out.println("The person is female.");
        }
    }
    public Person createChild(Person partner, String firstName, String birthDate)
    {
        if (partner.isPersonFemale() == this.isPersonFemale()) {
            System.out.println("Sorry, you can't create a child on your own.");
            return null;
        } else {
            Person mother;
            Person father;
            Person child;
            if (this.isPersonFemale()) {
                mother = this;
                father = partner;
            } else {
                mother = partner;
                father = this;
            }
            child = new Person(firstName, father.getLastName(), 0, 20, 7.5, mother.getIQ(), birthDate);
            return child;
        }
    }
}