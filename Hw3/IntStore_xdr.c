/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include "IntStore.h"

bool_t
xdr_arr (XDR *xdrs, arr *objp)
{
	register int32_t *buf;

	int i;

	if (xdrs->x_op == XDR_ENCODE) {
		buf = XDR_INLINE (xdrs, ( 8 ) * BYTES_PER_XDR_UNIT);
		if (buf == NULL) {
			 if (!xdr_vector (xdrs, (char *)objp->Arr, 8,
				sizeof (int), (xdrproc_t) xdr_int))
				 return FALSE;
		} else {
			{
				register int *genp;

				for (i = 0, genp = objp->Arr;
					i < 8; ++i) {
					IXDR_PUT_LONG(buf, *genp++);
				}
			}
		}
		return TRUE;
	} else if (xdrs->x_op == XDR_DECODE) {
		buf = XDR_INLINE (xdrs, ( 8 ) * BYTES_PER_XDR_UNIT);
		if (buf == NULL) {
			 if (!xdr_vector (xdrs, (char *)objp->Arr, 8,
				sizeof (int), (xdrproc_t) xdr_int))
				 return FALSE;
		} else {
			{
				register int *genp;

				for (i = 0, genp = objp->Arr;
					i < 8; ++i) {
					*genp++ = IXDR_GET_LONG(buf);
				}
			}
		}
	 return TRUE;
	}

	 if (!xdr_vector (xdrs, (char *)objp->Arr, 8,
		sizeof (int), (xdrproc_t) xdr_int))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_Node (XDR *xdrs, Node *objp)
{
	register int32_t *buf;

	 if (!xdr_int (xdrs, &objp->data))
		 return FALSE;
	 if (!xdr_pointer (xdrs, (char **)&objp->next, sizeof (Node), (xdrproc_t) xdr_Node))
		 return FALSE;
	 if (!xdr_pointer (xdrs, (char **)&objp->prev, sizeof (Node), (xdrproc_t) xdr_Node))
		 return FALSE;
	return TRUE;
}
