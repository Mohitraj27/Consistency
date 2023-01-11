/* GetIP Address
 public static InetAddress getLocalHost()
 throws UnknownHostException: Returns the address
 of the local host. This is achieved by retrieving the name of the 
 host from the system,then resolving that name into an InetAddress.
 Note: The resolved address may be cached for a short period of time.
 */
import java.net.InetAddress;
class Day_203
{
    public static void main(String args[])throws Exception
    {
        InetAddress myIP= InetAddress.getLocalHost();
        
        System.out.println("My IP Address is:");
        System.out.println(myIP.getHostAddress());
    }
}