public class Employee {
    private final  int id;
    private final String name;
    private final String cpf;
    private final String role;
    private final String photoPath;

    public Employee(int id, String name, String cpf, String role, String photoPath) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.role = role;
        this.photoPath = photoPath;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCpf() { return cpf; }
    public String getRole() { return role; }
    public String getPhotoPath() { return photoPath; }
}
