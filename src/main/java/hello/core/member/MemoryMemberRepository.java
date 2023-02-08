package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 데이터베이스 대용.
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // 동시성이슈주의. 컨커런트해쉬맵 참고.
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);  //
    }

    @Override
    public Member FindById(Long memberId) {
        return store.get(memberId);

    }
}
