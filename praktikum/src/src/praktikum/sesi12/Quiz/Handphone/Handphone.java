package praktikum.sesi12.Quiz.Handphone;

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
}

// Implementasi Phone: Xiaomi
class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Xiaomi volume increased to: " + volume);
            } else {
                System.out.println("Xiaomi volume is at MAX.");
            }
        } else {
            System.out.println("Turn on the Xiaomi first.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Xiaomi volume decreased to: " + volume);
            } else {
                System.out.println("Xiaomi volume is at MIN.");
            }
        } else {
            System.out.println("Turn on the Xiaomi first.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

// Implementasi lainnya: iPhone
class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("iPhone volume increased to: " + volume);
            } else {
                System.out.println("iPhone volume is at MAX.");
            }
        } else {
            System.out.println("Turn on the iPhone first.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("iPhone volume decreased to: " + volume);
            } else {
                System.out.println("iPhone volume is at MIN.");
            }
        } else {
            System.out.println("Turn on the iPhone first.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

// Kelas PhoneUser
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

// Main Program
public class Handphone {
    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        PhoneUser user = new PhoneUser(xiaomi);

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println();

        Phone iphone = new iPhone();
        PhoneUser user2 = new PhoneUser(iphone);

        user2.turnOnThePhone();
        user2.makePhoneLouder();
        user2.makePhoneSilent();
        user2.turnOffThePhone();
    }
}

