package model;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(final Member member) {
        memberRepository.save(member);
    }

    @Override
    public void findMember(final Long memberId) {
        return memberRepository.findById(memberId)
    }
}
