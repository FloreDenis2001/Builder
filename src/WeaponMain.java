import java.util.List;

public class WeaponMain {
    public static void main(String[] args) {
        final Weapon laserGun = new WeaponBuilder()
                .withDamage(123)
                .withName("LaserGun")
                .withPerks(List.of("Color:red"))
                .withDurability(50L)
                .build();
        System.out.println(laserGun.getDamage());
    }

}
