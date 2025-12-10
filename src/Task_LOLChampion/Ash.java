package Task_LOLChampion;

public class Ash extends Champion {
    public Ash(String name){
        super(name,1,600,50,600,500,100);
    }
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "이(가) 'Q' 스킬을 사용합니다.");
        attackTo(target);
    }
    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "이(가) 'R' 스킬을 사용합니다.");
        int hp = target.getHP()-getattackDamage();
        target.setHP(hp);
        System.out.println(target.getName()+"가"+getName()+"에게 공격 당하였습니다. 현재"+target.getName()+"의 체력은"+target.getHP()+"입니다.");
        //출력문을 데미지 계산 위에 위치시켜서 감소된 HP 확인이 안되었다.[문제]
        int mp = getMP();
        mp -= 100;
        setMP(mp);
        System.out.println(getName()+"의 남은 마력 : "+getMP());
    }
    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "이(가) 'E' 스킬을 사용합니다.");
        int hp = target.getHP()-getattackDamage();
        target.setHP(hp);
        System.out.println(target.getName()+"가"+getName()+"에게 공격 당하였습니다. 현재"+target.getName()+"의 체력은"+target.getHP()+"입니다.");
        //출력문을 데미지 계산 위에 위치시켜서 감소된 HP 확인이 안되었다.[문제]
        int mp = getMP();
        mp -= 50;
        setMP(mp);
        System.out.println(getName()+"의 남은 마력 : "+getMP());
    }
    @Override
    public void useW(Champion target) {
        System.out.println("------------useW------------");
        System.out.println(getName() + "이(가) 'E' 스킬을 사용합니다.");
        int hp = getattackDamage();
        System.out.println(target.getName()+"가"+getName()+"에게 공격 당하였습니다. 현재"+target.getName()+"의 체력은"+target.getHP()+"입니다.");
        //출력문을 데미지 계산 위에 위치시켜서 감소된 HP 확인이 안되었다.[문제]
        target.takeDamage(hp);
        int mp = getMP();
        mp -= 20;
        setMP(mp);
        System.out.println(getName()+"의 남은 마력 : "+getMP());

        System.out.println("----------------------------");
    }

}
