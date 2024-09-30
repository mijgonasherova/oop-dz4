
public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic) {
        teacherService.create(firstName, secondName, patronymic);
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
