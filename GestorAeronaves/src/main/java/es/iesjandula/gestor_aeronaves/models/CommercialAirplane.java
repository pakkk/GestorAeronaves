package es.iesjandula.gestor_aeronaves.models;

import es.iesjandula.gestor_aeronaves.utils.Constants;

/**
 * This class define the specific attributes and methods for whatever commercial airplane
 * 
 * @author Paco Benitez
 */
public class CommercialAirplane extends Aircraft implements Comparable<Aircraft>
{
	/** Attribute - Maximum seats of the commercial airplane */
	private double maxSeats ;
	
	/** Attribute - Class type of the passengers */
	private String classType ;
	
	/**
	 * Default constructor
	 */
	public CommercialAirplane()
	{
		super() ; // IMPORTANT! SUPER CALL
		
		this.maxSeats  = Constants.DEFAULT_COMMERCIAL_AIRPLANE_MAX_SEATS ;
		this.classType = Constants.DEFAULT_COMMERCIAL_AIRPLANE_CLASS_TYPE ;
	}

	/**
	 * @param model	    with the model of this aircraft
	 * @param maxSpeed  with the maximum speed of this aircraft
	 * @param maxSeats  with the maximum seats supported by this commercial airplane
	 * @param classType with the class type of this commercial airplane
	 */
	public CommercialAirplane(String model, double maxSpeed, double maxSeats, String classType)
	{
		super(model, maxSpeed) ; // IMPORTANT! SUPER CALL
		
		this.maxSeats  = maxSeats ;
		this.classType = classType ;
	}
	
	/**
	 * @return the maxSeats
	 */
	public double getMaxSeats()
	{
		return this.maxSeats ;
	}

	/**
	 * @return the classType
	 */
	public String getClassType()
	{
		return this.classType ;
	}

	/**
	 * @param maxSeats the maxSeats to set
	 */
	public void setMaxSeats(double maxSeats)
	{
		this.maxSeats = maxSeats ;
	}

	/**
	 * @param classType the classType to set
	 */
	public void setClassType(String classType)
	{
		this.classType = classType ;
	}

	/**
	 * @param object maybe a instanceof Commercial Airplane or not
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
		else if (!(object instanceof CommercialAirplane))
		{
			return false ;
		}
		
		CommercialAirplane other = (CommercialAirplane) object ;
		
		if (this.maxSeats != other.getMaxSeats())
		{
			return false ;
		}
		else if (this.classType == null || !this.classType.equals(other.getClassType()))
		{
			return false ;
		}
		
		return true ;
	}
	
	/**
	 * @param commercialAirplane with the object to be compared
	 * @return the value 0 if the argument CommercialAirplane is equal to this CommercialAirplane; 
	 * a value less than 0 if this CommercialAirplane is less than the CommercialAirplane argument; 
	 * and a value greater than 0 if this CommercialAirplane is greater than the CommercialAirplane argument.
	 */
	public int compareTo(CommercialAirplane commercialAirplane)
	{
		int result = super.compareTo(commercialAirplane) ; // IMPORTANT! SUPER CALL
		
		if (result == 0)
		{
			result = (int) (this.maxSeats - commercialAirplane.getMaxSeats()) ;
			
			if (result == 0)
			{
				if (this.classType == null)
				{
					result = -1 ;
				}
				else
				{
					result = this.classType.compareTo(commercialAirplane.getClassType()) ;
				}
			}	
		}
		
		return result ;
	}

	/**
	 * @return this commercial airplane as string
	 */
	@Override
	public String toString()
	{
		return super.toString() + // IMPORTANT! SUPER CALL
			 " CommercialAirplane [maxSeats=" + this.maxSeats + ", classType=" + this.classType + "]" ;
	}
	
	
}
