/*
* IntSrote.x Specification of the remote Integer storage on the server
* and client interactions
*/
/*
*
* Define 4 procedures
* append_intstore_1() an arrary of 8 integers
* query_intstore_1() int position at pos starting at 0
* remove_intstore_1() remove int at pos given starting at 0
* checkIn_intstore_1() see if the connection is made
*
*/

struct arr{
    int Arr[8];
};
struct Node{
    int data;

    struct Node* next;
    struct Node* prev;
};

program INTSTORE_PROG {
 version INTSTORE_VERS {
    string APPEND_INTSTORE(arr) = 1; /* procedure number = 1 */
    string QUERY_INTSTORE(int) = 2; /* procedure number = 2 */
    string REMOVE_INTSTORE(int) = 3; /* procedure number = 3 */
    string checkIn_INTSTORE(void) = 4; /* procedure number = 3 */
 } = 1; /* version number = 1 */


} = 0x315E91E3; 