# ResMake

ResMake is a mobile application that generates a professional resume using a predefined LaTeX template.

- Allows users to input personal, educational, and professional details through a structured form-based UI
- Dynamically maps user input to LaTeX code using a Room database for real-time updates and persistent storage
- Streamlines resume creation for users with no LaTeX experience, offering live preview, editable data, and seamless export to Overleaf for final formatting

## Workflow  
![Workflow Diagram](workflow.png)

1. User fills form → data saved via Room  
2. Data maps to dynamic LaTeX template  
3. Live preview of LaTeX code shown  
4. Code can be copied or exported to Overleaf  
5. Resume preview & print available  
6. Form reset clears all input  

## App Navigation  
![Navigation Flow](navigation.png)

- **Main**: Entry point to all features  
- **Form**: Input/edit resume details  
- **View**: Access/edit saved entries  
- **LaTeX**: Display & copy generated code  
- **Print**: Preview and export resume  
- **Clear**: Reset all data  

## Stack

- **Frontend**: Kotlin + XML  
- **Database**: Room (local storage)  
- **Export**: Overleaf (LaTeX editing)  

## Acknowledgements

Special thanks to [**Name of Contributor**](https://github.com/cyrilnoah1) for their helpful contributions to **ResMake**.

