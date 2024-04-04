# DROP TABLE IF EXISTS ticket

CREATE TABLE ticket (
    TicketId INTEGER AUTO_INCREMENT PRIMARY KEY,
    Location VARCHAR(20),
    Category VARCHAR(20),
    TicketInfo VARCHAR(50),
    ConfigurationItem VARCHAR(10),
    Priority INTEGER,
    Opened Date,
    OpenedBy VARCHAR(20),
    State INTEGER,
    AssignedTo VARCHAR(20),
    ClosedTime Date
);



CREATE TABLE resolvedTickets (
     TicketId INTEGER PRIMARY KEY,
     resolvedBy VARCHAR(20)
);