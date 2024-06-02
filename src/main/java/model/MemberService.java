package model;

public interface MemberService {
    void join(Member member);

    void findMember(Long memberId);
}
