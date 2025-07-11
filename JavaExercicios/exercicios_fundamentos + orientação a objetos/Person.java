public sealed abstract class Person permits Student, Teacher {
    private final String name;
    private final int age;
    private final String cpf;

    public Person(String name, int age, String cpf){
        this.name = name;
        this.age = age;
        this.cpf = cpf;

    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public String getCpf(){return cpf;}

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d\nCpf: %s\n", name, age, cpf);
    }

    public static void main(String[] args){
        Person aluno1 = new Student("martins", 23, "344.324.234-24",4234);
        System.out.println(aluno1);
        Person prof = new Teacher("Raul", 21, "344.566.134-90", 1243);
        System.out.println(prof);

    }
}

non-sealed class Student extends Person{
    private final int matricula;

    public Student(String name, int age, String cpf, int matricula){
        super(name, age, cpf);
        this.matricula = matricula;
    }

    public int getMatricula(){return matricula;}

    @Override
    public String toString() {
        return String.format(super.toString() + "Matricula: %d\n", matricula);
    }
}
non-sealed class Teacher extends Person{
    private final int id;

    public Teacher(String name, int age, String cpf, int id){
        super(name, age, cpf);
        this.id = id;
    }

    public int getId(){return id;}

    @Override
    public String toString() {
        return super.toString();
    }
}


