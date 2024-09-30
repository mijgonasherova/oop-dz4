public class Teacher extends User{

    public boolean getTeacherId;
    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, Long countMaxId) {
        super(firstName, secondName, patronymic);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
