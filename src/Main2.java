public class Main2 {
    public static void main(String[] args) {


        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.STAFF);
        bossWeapon.setName("Dark Magic Staff");


        Boss2 boss = new Boss2(1200, 80);
        boss.setWeapon(bossWeapon); // Устанавливаем оружие


        boss.printInfo();
        System.out.println("---------------------");



        Weapon skelWeapon1 = new Weapon();
        skelWeapon1.setWeaponType(WeaponType.BOW);
        skelWeapon1.setName("Rusty Longbow");


        Skeleton skeleton1 = new Skeleton(150, 15, 50);
        skeleton1.setWeapon(skelWeapon1); // Устанавливаем унаследованное оружие


        skeleton1.printInfo();
        System.out.println("---------------------");


        Weapon skelWeapon2 = new Weapon();
        skelWeapon2.setWeaponType(WeaponType.SWORD);
        skelWeapon2.setName("Bone Sword");


        Skeleton skeleton2 = new Skeleton(180, 20, 10);
        skeleton2.setWeapon(skelWeapon2);


        skeleton2.printInfo();
        System.out.println("---------------------");
    }
}
