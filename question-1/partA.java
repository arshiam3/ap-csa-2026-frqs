public Account(String requestedName) {
            username = requestedName;
  
        if (!username.isAvailable()) {
            int i = 1;
            while (!username.isAvailable()) {
                username = username+i;
                i++;
            }

        }

    } // end of Account constructor

