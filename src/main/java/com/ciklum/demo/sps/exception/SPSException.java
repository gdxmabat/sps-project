package com.ciklum.demo.sps.exception;

public class SPSException extends Exception
{

    private static final long serialVersionUID = 1997753363232807009L;

		public SPSException()
		{
		}

		public SPSException(String message)
		{
			super(message);
		}

		public SPSException(Throwable cause)
		{
			super(cause);
		}

		public SPSException(String message, Throwable cause)
		{
			super(message, cause);
		}

		public SPSException(String message, Throwable cause, 
                                           boolean enableSuppression, boolean writableStackTrace)
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}

}