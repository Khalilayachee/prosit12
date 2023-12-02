public class Etudiant {
    private  int id;
    private  String nom;
    private  int age;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public Etudiant(int id, String nom, int age) {
        this.id=id ;
        this.nom=nom;
        this.age=age;


    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Etudiant() {
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

}
