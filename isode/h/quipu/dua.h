/*****************************************************************************

 @(#) $Id$

 -----------------------------------------------------------------------------

 Copyright (c) 2001-2007  OpenSS7 Corporation <http://www.openss7.com/>
 Copyright (c) 1997-2001  Brian F. G. Bidulock <bidulock@openss7.org>

 All Rights Reserved.

 This program is free software; you can redistribute it and/or modify it under
 the terms of the GNU General Public License as published by the Free Software
 Foundation; version 3 of the License.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details.

 You should have received a copy of the GNU General Public License along with
 this program.  If not, see <http://www.gnu.org/licenses/>, or write to the
 Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.

 -----------------------------------------------------------------------------

 U.S. GOVERNMENT RESTRICTED RIGHTS.  If you are licensing this Software on
 behalf of the U.S. Government ("Government"), the following provisions apply
 to you.  If the Software is supplied by the Department of Defense ("DoD"), it
 is classified as "Commercial Computer Software" under paragraph 252.227-7014
 of the DoD Supplement to the Federal Acquisition Regulations ("DFARS") (or any
 successor regulations) and the Government is acquiring only the license rights
 granted herein (the license rights customarily provided to non-Government
 users).  If the Software is supplied to any unit or agency of the Government
 other than DoD, it is classified as "Restricted Computer Software" and the
 Government's rights in the Software are defined in paragraph 52.227-19 of the
 Federal Acquisition Regulations ("FAR") (or any successor regulations) or, in
 the cases of NASA, in paragraph 18.52.227-86 of the NASA Supplement to the FAR
 (or any successor regulations).

 -----------------------------------------------------------------------------

 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See http://www.openss7.com/

 -----------------------------------------------------------------------------

 Last Modified $Date$ by $Author$

 -----------------------------------------------------------------------------

 $Log$
 *****************************************************************************/

#ifndef __ISODE_QUIPU_DUA_H__
#define __ISODE_QUIPU_DUA_H__

#ident "@(#) $RCSfile$ $Name$($Revision$) Copyright (c) 2001-2007 OpenSS7 Corporation."

/* dua.h - */

/*
 * Header: /xtel/isode/isode/h/quipu/RCS/dua.h,v 9.0 1992/06/16 12:23:11 isode Rel
 *
 *
 * Log: dua.h,v
 * Revision 9.0  1992/06/16  12:23:11  isode
 * Release 8.0
 *
 */

/*
 *				  NOTICE
 *
 *    Acquisition, use, and distribution of this module and related
 *    materials are subject to the restrictions of a license agreement.
 *    Consult the Preface in the User's Manual for the full terms of
 *    this agreement.
 *
 */

#define default_common_args \
	{ \
		{       /* service controls */ \
			0, \
			SVC_PRIO_MED, \
			SVC_NOTIMELIMIT, \
			SVC_NOSIZELIMIT, \
			SVC_REFSCOPE_NONE \
		}, \
		NULLDN,      /* Common arg - requestor DN */ \
		{       /* op_progress */ \
			OP_PHASE_NOTDEFINED, \
			OP_PHASE_NOTDEFINED, \
		}, \
		CA_NO_ALIASDEREFERENCED, \
		(struct security_parms *) NULL, \
		(struct signature *) NULL, \
		(struct extension *) NULL, \
	}

#endif				/* __ISODE_QUIPU_DUA_H__ */