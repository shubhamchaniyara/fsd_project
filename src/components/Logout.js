import React from "react";
import { useUserAuth } from "../context/UserAuthContext";

const Logout = () => {
  const { logOut } = useUserAuth();

  const handleLogout = async () => {
    try {
      await logOut();
      // Optional: You can redirect the user to the login page or any other page after logout.
    } catch (error) {
      console.error("Error logging out:", error.message);
    }
  };

  return (
    <button onClick={handleLogout}>Logout</button>
  );
};

export default Logout;
