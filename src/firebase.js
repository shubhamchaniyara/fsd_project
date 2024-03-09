import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";

const firebaseConfig = {
  apiKey: "AIzaSyBbhOVjMNdjNYvb1hjjmyfgiMXZ2fFVqaA",
  authDomain: "titanium-quiz-b89fd.firebaseapp.com",
  projectId: "titanium-quiz-b89fd",
  storageBucket: "titanium-quiz-b89fd.appspot.com",
  messagingSenderId: "206489782533",
  appId: "1:206489782533:web:7210b1bae9fe92e6128f6c",
  measurementId: "G-QZQS55S83L"
};

const app = initializeApp(firebaseConfig);
export const auth = getAuth(app);
export default app;

