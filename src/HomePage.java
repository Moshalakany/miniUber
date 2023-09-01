import java.util.Scanner;
public class HomePage {
    Scanner input = new Scanner(System.in);
    Scanner in = new Scanner(System.in);

    public HomePage()
    {
    }

    Rider rider;

    public void home() {
        char choice;
        int type;
        String pickup;
        String dest;
        System.out.println("press 1 to request ride");
        System.out.println("press 2 to support ticket");
        System.out.println("press 3 to logout");
        choice = input.next().charAt(0);
        RequestRide request = RequestRide.getInstance();
            switch (choice) {
                case '1':
                    System.out.println("Enter the pickup point");
                    pickup = input.next();
                    System.out.println("Enter your destination");
                    dest = input.next();
                    System.out.println("Press 1 for Normal");
                    System.out.println("Press 2 for Premium");
                    System.out.println("Press 3 for MotorBike");
                    System.out.println("Press 4 for Bus");
                    type = input.nextInt();
                    switch (type) {
                        case 1: {
                            rider = new normal("ZSC 1911", "Black", "KIA", "Bassel");
                            request.setRideDetails(rider, pickup, dest);
                            request.requestRide();
                            break;
                        }
                        case 2: {
                            rider = new premium("NUM 1", "Grey", "BMW", "Yehia");
                            request.setRideDetails(rider, pickup, dest);
                            request.requestRide();
                            break;
                        }
                        case 3: {
                            rider = new motorBike("1b12r2", "Black", "Honda", "Elsayed");
                            request.setRideDetails(rider, pickup, dest);
                            request.requestRide();
                            break;
                        }
                        case 4: {
                            rider = new Bus("aaa 111", "Blue", "MCV", "3am 3abdo");
                            request.setRideDetails(rider, pickup, dest);
                            request.requestRide();
                            break;
                        }
                        default: {
                            System.out.println("Wrong Input!!");
                            break;
                        }
                    }
                   PaymentProcess.payAmount(RequestRide.cost);
                    home();
                break;
                case '2':
                {
                    SupportSystem supportSystem = new SupportSystem();
                    System.out.println("enter your problem type \n 1 for Customer Service\n 2 for Technical support\n 3 for payment Support");
                    int priority= input.nextInt();
                    System.out.println("enter your problem");
                        String problem = in.nextLine();
                        SupportTicket ticket = new SupportTicket(problem, priority);
                    supportSystem.processSupportTicket(ticket);
                    home();
                    break;
                }
                case '3':
                {
                 return ;
                }
                default: {
                    System.out.println("Wrong Input!!");
                }
                home();
            }


        }
    }

