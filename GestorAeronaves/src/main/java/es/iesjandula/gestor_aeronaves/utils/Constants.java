package es.iesjandula.gestor_aeronaves.utils;

/**
 * This class contains every constant as final static definition
 * 
 * @author Paco Benítez
 *
 */
public class Constants
{
	/**********************************************************/
	/*********************** AIRCRAFT *************************/
	/**********************************************************/
	
	/** Constant - Aircraft - Default model */
	public static final String DEFAULT_AIRCRAFT_MODEL 	     		  = "Undefined" ;
	
	/** Constant - Aircraft - Default maximum speed */
	public static final double DEFAULT_AIRCRAFT_MAX_SPEED    		  = -1.0d ;

	/**********************************************************/
	/************************* DRONE **************************/
	/**********************************************************/
	
	/** Constant - Drone - Default maximum weight */
	public static final double DEFAULT_DRONE_MAX_WEIGHT      		  = -1.0d ;

	/** Constant - Drone - Default flight duration */
	public static final double DEFAULT_DRONE_FLIGHT_DURATION 		  = -1.0d ;

	/**********************************************************/
	/******************* COMMERCIAL AIRPLANE ******************/
	/**********************************************************/
	
	/** Constant - Commercial Airplane - Default maximum seats */
	public static final int DEFAULT_COMMERCIAL_AIRPLANE_MAX_SEATS     = -1 ;

	/** Constant - Commercial Airplane - Class types */
	public static final String[] CLASS_TYPES					      = {"Tourist Class", "First Class", "Executive Class"} ;
	
	/** Constant - Commercial Airplane - Default class type */
	public static final String DEFAULT_COMMERCIAL_AIRPLANE_CLASS_TYPE = CLASS_TYPES[0] ;
}
