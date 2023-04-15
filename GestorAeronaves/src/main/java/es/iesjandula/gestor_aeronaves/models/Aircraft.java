package es.iesjandula.gestor_aeronaves.models ;

import es.iesjandula.gestor_aeronaves.utils.Constants ;

/**
 * This class define the common attributes and methods for whatever aircraft
 * 
 * @author Paco Benitez
 */
public class Aircraft implements Comparable<Aircraft>
{
	/** Attribute - Model of the aircraft */
	private String model ;
	
	/** Attribute - Maximum speed of the aircraft */
	private double maxSpeed ;
	
	/**
	 * Default constructor
	 */
	public Aircraft()
	{
		this.model 	  = Constants.DEFAULT_AIRCRAFT_MODEL ;
		this.maxSpeed = Constants.DEFAULT_AIRCRAFT_MAX_SPEED ;
	}

	/**
	 * @param model	   with the model of this aircraft
	 * @param maxSpeed with the maximum speed of this aircraft
	 */
	public Aircraft(String model, double maxSpeed)
	{
		this.model    = model ;
		this.maxSpeed = maxSpeed ;
	}

	/**
	 * @return the model
	 */
	public String getModel()
	{
		return this.model ;
	}

	/**
	 * @return the maxSpeed
	 */
	public double getMaxSpeed()
	{
		return this.maxSpeed ;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model ;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(double maxSpeed)
	{
		this.maxSpeed = maxSpeed ;
	}
	
	/**
	 * @param object maybe a instanceof Aircraft or not
	 * @return true if both objects are the same
	 */	
	@Override
	public boolean equals(Object object)
	{
		if (this == object)
		{
			return true ;			
		}
		else if (object == null)
		{
			return false ;
		}
		else if (!(object instanceof Aircraft))
		{
			return false ;
		}
		
		Aircraft other = (Aircraft) object ;
		
		if (this.maxSpeed != other.getMaxSpeed())
		{
			return false ;
		}
		else if (this.model == null || !this.model.equals(other.getModel()))
		{
			return false ;
		}
		
		return true ;
	}

	/**
	 * @param aircraft with the object to be compared
	 * @return the value 0 if the argument Aircraft is equal to this Aircraft; 
	 * a value less than 0 if this Aircraft is less than the Aircraft argument; 
	 * and a value greater than 0 if this Aircraft is greater than the Aircraft argument.
	 */
	public int compareTo(Aircraft aircraft)
	{
		int result = (int) (this.maxSpeed - aircraft.getMaxSpeed()) ;
		
		if (result == 0)
		{
			if (this.model == null)
			{
				result = -1 ;
			}
			else
			{
				result = this.model.compareTo(aircraft.getModel()) ;
			}
		}
		
		return result ;
	}

	/**
	 * @return this aircraft as string
	 */
	@Override
	public String toString()
	{
		return "Aircraft [model=" + this.model + ", maxSpeed=" + this.maxSpeed + "]" ;
	}
}
