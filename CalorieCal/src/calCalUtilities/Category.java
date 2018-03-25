/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calCalUtilities;

/**
 *
 * @author MQ0162246
 */
public class Category {


	private String id;
	private String name;
        private int categoriyCalories;

    public Category(String id, String name, int categoriyCalories) {
        this.id = id;
        this.name = name;
        this.categoriyCalories = categoriyCalories;
    }
        
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return (id+" "+ name); //To change body of generated methods, choose Tools | Templates.
	}

    /**
     * @return the categoriyCalories
     */
    public int getCategoriyCalories() {
        return categoriyCalories;
    }

    /**
     * @param categoriyCalories the categoriyCalories to set
     */
    public void setCategoriyCalories(int categoriyCalories) {
        this.categoriyCalories = categoriyCalories;
    }
	
	
}
