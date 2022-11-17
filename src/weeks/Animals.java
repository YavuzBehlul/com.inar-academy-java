package weeks;

public class Animals {
    private String name;
    private int weight;
    private int height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;

    public Animals() {
        this(null, 0, 0, false, false);
    }

    public Animals(String name, int weight, int height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public void runs(int level) {
        int velocity = 0;
        switch (level) {
            case 1:
                velocity = 5;
        }
        System.out.println("Runs with" + velocity);

    }

    public String[] eats(String animal) {
        int count = 0;
        String[] animals = new String[100];
        for (int i = 0; i <= count; i++) {
            animals[i] = animal;
            count++;
        }
        return animals;

    }

}


