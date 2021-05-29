package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<String> members = new ArrayList<>();
    private String groupName;

    public Group(String name){
        setGroupName(name);
    }
    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName +
                ", members=" + members + '\'' +
                '}';
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String newMember){
        members.add(newMember);
    }

    public void removeMember(String memberName){
        members.remove(memberName);
    }
    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
