package model;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void Save(final Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(final Long memberId) {
        return store.get(memberId);
    }
}
