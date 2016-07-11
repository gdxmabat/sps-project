package com.ciklum.demo.sps.exception;

/**
 * The Class SPSException.
 * 
 * Custom exception for this DEMO. 
 * It could be more construct method if we need it
 * 
 */
public class SPSException extends Exception
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1997753363232807009L;

		/**
		 * Instantiates a new SPS exception.
		 *
		 * @param message the message
		 */
		public SPSException(String message)
		{
			super(message);
		}



}