package sec15;

import java.util.HashSet;
import java.util.Set;

class Member {
    private int memberId;
    private String memberName;

    int getMemberId() {
        return memberId;
    }

    void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    String getMemberName() {
        return memberName;
    }

    void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // @Override
    // public int hashCode() {
    //     return memberId;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj instanceof Member) {
    //         Member compare = (Member)obj;

    //         if (this.memberId == compare.memberId) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     }
    //     return false;
    // }
}

public class Ex15_04 {
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new Member();

        member1.setMemberId(1);
        member1.setMemberName("김일남");

        member2.setMemberId(1);
        member2.setMemberName("김일남");

        System.out.println(member1.getMemberId() + "번 " + member1.getMemberName());
        System.out.println(member2.getMemberId() + "번 " + member1.getMemberName());

        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
        
        System.out.println(member1.equals(member2));

        Set<Member> list = new HashSet<>();
        list.add(member1);
        list.add(member2);

        System.out.println(list.size());
    }
}
