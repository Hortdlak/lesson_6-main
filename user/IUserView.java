package user;

import java.util.List;

// Принцип интерфейсной сегрегации (ISP) - было
public interface IUserView<T extends User> {
    void sendOnConsole(List<T> users);
}
