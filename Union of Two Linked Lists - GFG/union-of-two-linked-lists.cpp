//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

struct Node
{
	int data;
	struct Node* next;
	
	Node(int x){
	    data = x;
	    next = NULL;
	}
	
};


// } Driver Code Ends
/*
// structure of the node is as follows

struct Node
{
	int data;
	struct Node* next;
	
	Node(int x){
	    data = x;
	    next = NULL;
	}
	
};

*/

class Solution
{
    public:
   struct Node* makeUnion(struct Node* head1, struct Node* head2)
    {
        // code here
        set<int>s;
        while(head1!=NULL)
        {
            s.insert(head1->data);
            head1=head1->next;
            
        }
        while(head2!=NULL)
        {
            s.insert(head2->data);
            head2=head2->next;
        }
        Node* head=new Node(-1);
        Node* temp=head;
        auto it = s.begin();
        while(it != s.end()){
            //Node* nn = new Node(*it);
            // //if(it == s.begin()){
            //     head = nn;
            //     temp = nn;
            // }
            // else{
            //     temp -> next = nn;
            //     temp = nn;
            // }
            temp->next=new Node(*it);
            temp=temp->next;
            it++;
        }
        return head->next;
    }
};


//{ Driver Code Starts.

struct Node* buildList(int size)
{
    int val;
    cin>> val;
    
    Node* head = new Node(val);
    Node* tail = head;
    
    for(int i=0; i<size-1; i++)
    {
        cin>> val;
        tail->next = new Node(val);
        tail = tail->next;
    }
    
    return head;
}

void printList(Node* n)
{
    while(n)
    {
        cout<< n->data << " ";
        n = n->next;
    }
    cout<< endl;
}


int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, m;
        
        cin>>n;
        Node* first = buildList(n);
        
        cin>>m;
        Node* second = buildList(m);
        Solution obj;
        Node* head = obj.makeUnion(first,second);
        printList(head);
    }
    return 0;
}

// } Driver Code Ends