/*
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * Copyrights:
 *
 * Copyright - 1999 Sun Microsystems, Inc. All rights reserved.
 * 901 San Antonio Road, Palo Alto, California 94043, U.S.A.
 *
 * This product and related documentation are protected by copyright and
 * distributed under licenses restricting its use, copying, distribution, and
 * decompilation. No part of this product or related documentation may be
 * reproduced in any form by any means without prior written authorization of
 * Sun and its licensors, if any.
 *
 * RESTRICTED RIGHTS LEGEND: Use, duplication, or disclosure by the United
 * States Government is subject to the restrictions set forth in DFARS
 * 252.227-7013 (c)(1)(ii) and FAR 52.227-19.
 *
 * The product described in this manual may be protected by one or more U.S.
 * patents, foreign patents, or pending applications.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * Author:
 *
 * AePONA Limited, Interpoint Building
 * 20-24 York Street, Belfast BT15 1AQ
 * N. Ireland.
 *
 *
 * Module Name   : JAIN TCAP API
 * File Name     : ComponentConstants.java
 * Originator    : Colm Hayden & Phelim O'Doherty [AePONA]
 * Approver      : Jain Tcap Edit Group
 *
 * HISTORY
 * Version   Date      Author              Comments
 * 1.1     16/10/2000  Phelim O'Doherty    Updated problem types and
 *                                         inserted ommited problem codes.
 *                                         Made constructor private.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package jain.protocol.ss7.tcap.component;

/**
 * Constants used in package jain.protocol.ss7.tcap.component
 *
 * @author     Sun Microsystems Inc.
 * @version    1.1
 */
public class ComponentConstants {

    /**
    * Constructor for the ComponentConstants object
    */
    private ComponentConstants() {
    }

    private final static int CLASS_TYPE = 0;

    /**
    * Class Type constants (used byInvokeReqEvent): Both success and failure are
    * reported. It has an integer value of 1.
    */
    public final static int CLASS_1 = CLASS_TYPE | 1;

    /**
    * Class Type constants (used byInvokeReqEvent): Only failure is reported. It
    * has an integer value of 2.
    */
    public final static int CLASS_2 = CLASS_TYPE | 2;

    /**
    * Class Type constants (used byInvokeReqEvent): Only success is reported. It
    * has an integer value of 3.
    */
    public final static int CLASS_3 = CLASS_TYPE | 3;

    /**
    * Class Type constants (used byInvokeReqEvent): Neither success nor failure
    * are reported. It has an integer value of 4.
    */
    public final static int CLASS_4 = CLASS_TYPE | 4;

    private final static int ERROR_TYPE = 0;

    /**
    * Error Type constant (used by the Error events): Indicates a Global
    * Error(ITU) or National Error(ANSI), this has an integer value of 1.
    */
    public final static int ERROR_GLOBAL = ERROR_TYPE | 1;

    /**
    * Error Type constant (used by the Error events): Indicates a Local
    * Error(ITU) or Private Error(ANSI), this has an integer value of 2.
    */
    public final static int ERROR_LOCAL = ERROR_TYPE | 2;

    private final static int REJECT_TYPE = 0;

    /**
    * Reject Type Constant (used by Reject Events): Indicates that this Reject
    * Component is a Local Reject. It has an integer value of 1.
    */
    public final static int REJECT_TYPE_LOCAL = REJECT_TYPE | 1;

    /**
    * Reject Type Constant (used by Reject Events):Indicates that this Reject
    * Component is a Remote Reject. It has an integer value of 2.
    */
    public final static int REJECT_TYPE_REMOTE = REJECT_TYPE | 2;

    /**
    * Reject Type Constant (used by Reject Events): Indicates that this Reject
    * Component is a User Reject. It has an integer value of 3.
    */
    public final static int REJECT_TYPE_USER = REJECT_TYPE | 3;

    private final static int PROBLEM_TYPE = 0;

    /**
    * Problem Type constant: This problem type applies to the component sublayer
    * in <b>General</b> , and does not relate to any specific component type. All
    * of these are generated by the component sublayer. It has an integer value
    * of 1.
    */
    public final static int PROBLEM_TYPE_GENERAL = PROBLEM_TYPE | 1;

    /**
    * Problem Type constant: This problem type relates only to the <b>Invoke</b>
    * component type. It has an integer value of 2.
    */
    public final static int PROBLEM_TYPE_INVOKE = PROBLEM_TYPE | 2;

    /**
    * Problem Type constant: This element contains one of the problem codes which
    * relate only to the <b>Return Result</b> component type. It has an integer
    * value of 3.
    */
    public final static int PROBLEM_TYPE_RETURN_RESULT = PROBLEM_TYPE | 3;

    /**
    * Problem Type constant: This problem type relates only to the <b>Return
    * Error</b> component type. It has an integer value of 4.
    */
    public final static int PROBLEM_TYPE_RETURN_ERROR = PROBLEM_TYPE | 4;

    /**
    * Problem Type constant: This describes a problem specific to a <b>
    * Transaction</b> primitive. This classification of problem type is an ANSI
    * type only. It has an integer value of 5.
    */
    public final static int PROBLEM_TYPE_TRANSACTION = PROBLEM_TYPE | 5;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_GENERAL): The component
    * type is not recognised. It has an integer value of 1
    */
    public final static int PROBLEM_CODE_UNRECOGNISED_COMPONENT = 1;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_GENERAL): The element
    * structure of a component does not conform to the defined structure of that
    * component. <b>This constant is the equivalent of the Incorrect Component
    * Portion in ANSI</b> . It has an integer value of 2.
    */
    public final static int PROBLEM_CODE_MISTYPED_COMPONENT = 2;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_GENERAL): The contents of
    * the component do not conform to the encoding rules. It has an integer value
    * of 3.
    */
    public final static int PROBLEM_CODE_BADLY_STRUCTURED_COMPONENT = 3;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_GENERAL): General
    * encoding problems not covered by the other General Problem codes. <b>Can
    * only be used by an ANSI 1996 implementation of the JAIN TCAP API.</b> It
    * has an integer value of 4.
    */
    public final static int PROBLEM_CODE_INCORRECT_COMPONENT_CODING = 4;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): The invoke ID is
    * that of a previously invoked operation which has not been completed. This
    * code is generated by a TcapListener. It has an integer value of 5.
    */
    public final static int PROBLEM_CODE_DUPLICATE_INVOKE_ID = 5;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): The operation
    * code is not one of those agreed by the two TcapListeners. It has an integer
    * value of 6.
    */
    public final static int PROBLEM_CODE_UNRECOGNIZED_OPERATION = 6;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE or
    * PROBLEM_TYPE_RETURN_RESULT or PROBLEM_TYPE_RETURN_ERROR): Signifies that
    * the type of parameter in an invoke/return_result/return error component is
    * not that agreed by the two TcapListeners. Equivalent to <i>Incorrect
    * Parameter</i> in the ANSI T1.114 recommendations. It has an integer value
    * of 7.
    */
    public final static int PROBLEM_CODE_MISTYPED_PARAMETER = 7;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): Sufficient
    * resources are not available to perform the requested operation. This code
    * is generated by the TcapListener. Specific to an ITU implementation of the
    * JAIN TCAP API. It has an integer value of 8.
    */
    public final static int PROBLEM_CODE_RESOURCE_LIMITATION = 8;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): The requested
    * operation cannot be invoked because the dialogue is about to be released.
    * Specific to an ITU implementation of the JAIN TCAP API. This code is
    * generated only by the TcapListener. It has an integer value of 9.
    */
    public final static int PROBLEM_CODE_INITIATING_RELEASE = 9;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): The linked ID
    * does not correspond to an active invoke operation. This code is generated
    * only by the Provider. This code is equivalent to the <i>Correlation Id</I>
    * in an ANSI implemetaion of the JAIN TCAP API. It has an integer value of
    * 10.
    */
    public final static int PROBLEM_CODE_UNRECOGNIZED_LINKED_ID = 10;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): The operation
    * referred to by the linked ID is not an operation for which linked invokes
    * are allowed. Specific to an ITU implementation of the JAIN TCAP API. This
    * code is generated only by the TcapListener. It has an integer value of 11.
    */
    public final static int PROBLEM_CODE_LINKED_RESPONSE_UNEXPECTED = 11;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_INVOKE): The operation
    * referred to by the linked ID does not allow this linked operation. This
    * code is generated only by the TcapListener. Specific to an ITU
    * implementation of the JAIN TCAP API. It has an integer value of 12.
    */
    public final static int PROBLEM_CODE_UNEXPECTED_LINKED_OPERATION = 12;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_RETURN_RESULT or
    * PROBLEM_TYPE_RETURN_ERROR): No operation with the specified invoke ID is in
    * progress. This code is generated by the Provider. Equivalent to the <i>
    * Correlation Id</I> in an ANSI implemetaion of the JAIN TCAP API. It has an
    * integer value of 13.
    */
    public final static int PROBLEM_CODE_UNRECOGNIZED_INVOKE_ID = 13;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_RETURN_RESULT): The
    * invoked operation does not report success. This code is generated by the
    * Provider. It has an integer value of 14.
    */
    public final static int PROBLEM_CODE_RETURN_RESULT_UNEXPECTED = 14;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_RETURN_ERROR): The
    * invoked operation does not report failure. This code is generated by the
    * Provider. It has an integer value of 15.
    */
    public final static int PROBLEM_CODE_RETURN_ERROR_UNEXPECTED = 15;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_RETURN_ERROR): The error
    * code is not one of those agreed by the two TcapListeners. It has an integer
    * value of 16.
    */
    public final static int PROBLEM_CODE_UNRECOGNIZED_ERROR = 16;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_RETURN_ERROR): An
    * unexpected or undefined parameter was received. This code is generated by
    * the Provider. It has an integer value of 17.
    */
    public final static int PROBLEM_CODE_UNEXPECTED_ERROR = 17;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_TRANSACTION): Indicates
    * that the package type has not been defined. Specific to an ANSI
    * implementation of the JAIN TCAP API. It has an integer value of 18.
    */
    public final static int PROBLEM_CODE_UNRECOGNIZED_PACKAGE_TYPE = 18;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_TRANSACTION): An
    * unexpected or undefined error was received within the Dialogue/Transaction
    * handling primitive. Specific to an ANSI implementation of the JAIN TCAP
    * API. It has an integer value of 19.
    */
    public final static int PROBLEM_CODE_INCORRECT_TRANSACTION = 19;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_TRANSACTION): A
    * fundamental encoding problem (e.g. bad length). Specific to an ANSI
    * implementation of the JAIN TCAP API. It has an integer value of 20.
    */
    public final static int PROBLEM_CODE_BADLY_STRUCTURED_TRANSACTION = 20;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_TRANSACTION): The
    * received transaction id is derivable, but does not reflect a transaction
    * currently in progress. Specific to an ANSI implementation of the JAIN TCAP
    * API. It has an integer value of 21.
    */
    public final static int PROBLEM_CODE_UNASSIGNED_RESPONDING_ID = 21;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_TRANSACTION): For further
    * study. Specific to an ANSI implementation of the JAIN TCAP API. It has an
    * integer value of 22.
    */
    public final static int PROBLEM_CODE_PERMISSION_TO_RELEASE = 22;

    /**
    * Problem Code constant (ProblemType = PROBLEM_TYPE_TRANSACTION): Sufficient
    * resources are not available for the Provider to establish a dialogue.
    * Specific to an ANSI implementation of the JAIN TCAP API. It has an integer
    * value of 23.
    */
    public final static int PROBLEM_CODE_RESOURCE_UNAVAILABLE = 23;
}
