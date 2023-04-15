package es.iesjandula.gestor_aeronaves.models;

import es.iesjandula.gestor_aeronaves.utils.Constants;

/**
 * This class define the specific attributes and methods for whatever drone
 * 
 * @author Paco Benitez
 */
public class Drone extends Aircraft implements Comparable<Aircraft>
{
	/** Attribute - Maximum weight of the drone */
	private double maxWeight ;
	
	/** Attribute - Flight duration of the drone */
	private double flightDuration ;
	
	/**
	 * Default constructor
	 */
	public Drone()
	{
		super() ; // IMPORTANT! SUPER CALL
		
		this.maxWeight 	    = Constants.DEFAULT_DRONE_MAX_WEIGHT ;
		this.flightDuration = Constants.DEFAULT_DRONE_FLIGHT_DURATION ;
	}

	/**
	 * @param model	    	 with the model of this aircraft
	 * @param maxSpeed  	 with the maximum speed of this aircraft
	 * @param maxWeight 	 with the maximum weight supported by drones
	 * @param flightDuration with the duration of the flight of this drone
	 */
	public Drone(String model, double maxSpeed, double maxWeight, double flightDuration)
	{
		super(model, maxSpeed) ; // IMPORTANT! SUPER CALL
		
		this.maxWeight      = maxWeight ;
		this.flightDuration = flightDuration ;
	}

	/**
	 * @return the maxWeight
	 */
	public double getMaxWeight()
	{
		return this.maxWeight ;
	}

	/**
	 * @return the flightDuration
	 */
	public double getFlightDuration()
	{
		return this.flightDuration ;
	}

	/**
	 * @param maxWeight the maxWeight to set
	 */
	public void setMaxWeight(double maxWeight)
	{
		this.maxWeight = maxWeight ;
	}

	/**
	 * @param flightDuration the flightDuration to set
	 */
	public void setFlightDuration(double flightDuration)
	{
		this.flightDuration = flightDuration ;
	}
	
	/**
	 * @param object maybe a instanceof Drone or not
	 * @return true if both objects are the same
	 */	
	@Override
	public boolean equals(Object object)
	{
		if (!super.equals(object)) // IMPORTANT! SUPER CALL
		{
			return false ;
		}
		else if (this == object)
		{
			return true ;			
		}
		else if (object == null)
		{
			return false ;
		}
		else if (!(object instanceof Drone))
		{
			return false ;
		}
		
		Drone other = (Drone) object ;
		
		if (this.maxWeight != other.getMaxWeight())
		{
			return false ;
		}
		else if (this.flightDuration != other.getFlightDuration())
		{
			return false ;
		}
		
		return true ;
	}
	
	/**
	 * @param drone with the object to be compared
	 * @return the value 0 if the argument Drone is equal to this Drone; 
	 * a value less than 0 if this Drone is less than the Drone argument; 
	 * and a value greater than 0 if this Drone is greater than the Drone argument.
	 */
	public int compareTo(Drone drone)
	{
		int result = super.compareTo(drone) ; // IMPORTANT! SUPER CALL
		
		if (result == 0)
		{
			result = (int) (this.maxWeight - drone.getMaxWeight()) ;
			
			if (result == 0)
			{
				result = (int) (this.flightDuration - drone.getFlightDuration()) ;
			}	
		}
		
		return result ;
	}

	/**
	 * @return this drone as string
	 */
	@Override
	public String toString()
	{
		return super.toString() + // IMPORTANT! SUPER CALL
			 " Drone [maxWeight=" + this.maxWeight + ", flightDuration=" + this.flightDuration + "]" ;
	}
}
