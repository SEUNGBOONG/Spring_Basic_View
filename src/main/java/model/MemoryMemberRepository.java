package model;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static Map<Integer,String> lsy = new HashMap<>();

    @Override
    public void save(final Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(final Long memberId) {
        return store.get(memberId);
    }

    public void storeManage(){
        lsy.put(1,"se");
        lsy.put(1,"se");
        lsy.put(1,"se");
        lsy
    }
}
