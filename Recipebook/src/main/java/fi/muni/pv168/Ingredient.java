package fi.muni.pv168;

/**
 * class that represents an ingredient, that should be added into some meal
 * it contains name, amount and unit of amount
 * @date 5.3.2013
 * @author Mimo
 */
public class Ingredient implements Comparable<Ingredient> {
    
    /**
     * attributes
     */
    private String name;
    private double amount;
    private String unit;
    
    /**
     * constructors
     * @param name name of the ingredient - what it is
     * @param amount amount to add to the meal
     * @param unit amount of what do add to the meal
     */
    public Ingredient(){}
    public Ingredient(String name, double amount, String unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
    
    /**
     * getters, setters
     */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}
    public String getUnit() {return unit;}
    public void setUnit(String unit) {this.unit = unit;}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 53 * hash + (this.unit != null ? this.unit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingredient other = (Ingredient) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if ((this.unit == null) ? (other.unit != null) : !this.unit.equals(other.unit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "name=" + name + ", amount=" + amount + ", unit=" + unit + '}';
    }

    public int compareTo(Ingredient o) {
        int diff = this.getName().compareTo(o.getName());
        if (diff != 0) {
            return diff;
        } else {
            diff = this.getUnit().compareTo(o.getUnit());
            if (diff != 0) {
                return diff;
            } else {
                return new Double(this.getAmount()).compareTo(new Double(o.getAmount()));
            }
        }
    }
    
    
}
