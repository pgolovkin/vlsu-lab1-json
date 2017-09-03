package lab1;

import java.io.Serializable;

public class Group implements Serializable {

    private static final long serialVersionUID = -5445742990281160957L;

    private String groupName;
    private Integer studentsCount;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(Integer studentsCount) {
        this.studentsCount = studentsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (groupName != null ? !groupName.equals(group.groupName) : group.groupName != null) return false;
        return studentsCount != null ? studentsCount.equals(group.studentsCount) : group.studentsCount == null;
    }

    @Override
    public int hashCode() {
        int result = groupName != null ? groupName.hashCode() : 0;
        result = 31 * result + (studentsCount != null ? studentsCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studentsCount=" + studentsCount +
                '}';
    }
}
