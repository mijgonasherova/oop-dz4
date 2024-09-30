import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, countMaxId);
        teachers.add(teacher);
    }

// import java.util.ArrayList;
// import java.util.List;

// public class TeacherList {
//    private List<Teacher> teachers;
//
//    public TeacherList() {
//        this.teachers = new ArrayList<>();
//    }
//
//    public void addTeacher(Teacher teacher) {
//        teachers.add(teacher);
//    }
//
//    public void removeTeacher(int teacherId) {
//        teachers.removeIf(teacher -> teacher.getTeacherId() == teacherId);
//    }
//
//    public Teacher getTeacherById(int teacherId) {
//        return teachers.stream()
//                .filter(teacher -> teacher.getTeacherId() == teacherId)
//                .findFirst()
//                .orElse(null);
//    }
//
//    public void edit(int teacherId, String newFirstName, String newSecondName, String newPatronymic) {
//        Teacher teacher = getTeacherById(teacherId);
//        if (teacher != null) {
//            if (newFirstName != null && !newFirstName.isEmpty()) {
//                teacher.setFirstName(newFirstName);
//            }
//            if (newSecondName != null && !newSecondName.isEmpty()) {
//                teacher.setSecondName(newSecondName);
//            }
//            if (newPatronymic != null && !newPatronymic.isEmpty()) {
//                teacher.setPatronymic(newPatronymic);
//            }
//            System.out.println("Учитель обновлен.");
//        } else {
//            System.out.println("Учитель не найден.");
//        }
//    }
//    public List<Teacher> getAll() {
//        return new ArrayList<>(teachers);
//    }
//
//    public void displayTeachers() {
//        for (Teacher teacher : teachers) {
//            System.out.println("ID: " + teacher.getTeacherId() + ", ФИО: " + teacher.getFullName() + ", Предмет: " + teacher.getSubject());
//        }
//    }
//}
//    public Teacher getTeacherId(int teacherId) {
//        return null;
//    }
//    public void edit(int teacherId, String newFirstName, String newSecondName, String newPatronymic) {
//        Teacher teacher = getTeacherId(teacherId);
//        if (teacher != null) {
//            if (newFirstName != null && !newFirstName.isEmpty()) {
//                teacher.setFirstName(newFirstName);
//            }
//            if (newSecondName != null && !newSecondName.isEmpty()) {
//                teacher.setSecondName(newSecondName);
//            }
//            if (newPatronymic != null && !newPatronymic.isEmpty()) {
//                teacher.setPatronymic(newPatronymic);
//            }
//            System.out.println("Учитель обновлен.");
//        } else {
//            System.out.println("Учитель не найден.");
//        }
//    }
//
//    public List<Teacher> displayTeachers() {
//        List<Teacher> teacher = displayTeachers();
//        Collections.sort(teachers);
//        return teachers;
//
//    }
//
}

