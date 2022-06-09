import java.util.ArrayList;
import java.util.List;

public class WeaponBuilder {

    private String type;
    private String name;
    private Integer damage;
    private Long durability;
    private List<String> perks = new ArrayList<>();


    public WeaponBuilder withType(final String type) {
        this.type = type;
        return this;
    }

    public WeaponBuilder withName(final String name) {
        this.name = name;
        return this;
    }

    public WeaponBuilder withDamage(final Integer damage) {
        this.damage = damage;
        return this;
    }

    public WeaponBuilder withDurability(final Long durability) {
        this.durability = durability;
        return this;
    }

    public WeaponBuilder withPerks(final List<String> perks) {
        this.perks = perks;
        return this;
    }

    // creates the target object
    public Weapon build() {
        return new Weapon(type, name, damage, durability, perks);
    }

}
