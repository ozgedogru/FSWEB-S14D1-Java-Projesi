public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    public void addEmployee(JuniorDeveloper developer) {
        addDeveloper(developer, juniorDevelopers);
    }

    public void addEmployee(MidDeveloper developer) {
        addDeveloper(developer, midDevelopers);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addDeveloper(developer, seniorDevelopers);
    }

    private void addDeveloper(Employee developer, Employee[] developers) {
        for (int i = 0; i < developers.length; i++) {
            if (developers[i] == null) {
                developers[i] = developer;
                developer.work();
                System.out.println(developer.getName() + " added to the team.");
                return;
            } else {
                if (developers[i].getId() == developer.getId()) {
                    System.out.println("Employee with ID " + developer.getId() + " already exists in the team.");
                    return;
                }
            }
        }
        System.out.println("No available space for a new employee in the team.");
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to coordinate the team");
    }
}
