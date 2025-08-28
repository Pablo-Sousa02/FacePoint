public class Employe{
    private int id;
    private String name;
    private String cpf;
    private String role;
    private String photoPath;

    public Employe(int id, String name, String cpf, String role, String photoPath) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.role = role;
        this.photoPath = photoPath;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getCpf(){return cpf;}
    public String getRole(){return role;}
    public String getPhotoPath(){return photoPath;}
}