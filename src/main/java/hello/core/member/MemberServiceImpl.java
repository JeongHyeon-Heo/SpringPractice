package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.FindById(memberId);
    }
}
