import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {

  const HomeScreen({ Key? key }) : super(key: key);

   @override
   Widget build(BuildContext context) {
       return Scaffold(
           body: SafeArea(
            child: Center(
              // child: Text(
              //   'Hello World',
              //   style: TextStyle(
              //     color: Colors.blueAccent,
              //     fontSize: 50,
              //     fontWeight: FontWeight.bold
              //   ),
              // child: Icon(
              //     Icons.favorite,
              //     size: 100,
              //     color: Colors.red,
              //   ), 
              child: Image.asset('assets/monke.png'),
            ),
           ),
       );
  }
}