package teacher;

import java.util.ArrayList;
import java.util.List;

import user.UserComparator;

// Принцип единственной ответственности (SRP): Этот класс отвечает только за обработку коллекции учителей.
public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    // Принцип единственной ответственности (SRP): Этот метод отвечает только за сортировку коллекции учителей.
    public List<Teacher> getSortedTeacherGroupByFIO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(new UserComparator<>());
        return teacherList;
    }
}