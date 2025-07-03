# ResMake

ResMake is a mobile application that generates professional resumes using a predefined LaTeX template.

- Allows users to input personal, educational, and professional details through a structured form-based UI
- Dynamically maps user input to LaTeX code using a Room database for real-time updates and persistent storage
- Streamlines resume creation for users with no LaTeX experience, offering live preview, editable data, and seamless export to Overleaf for final formatting

## Features

- Form-based input for personal, academic, and professional information
- Automatic generation of LaTeX code
- Integration with Overleaf for resume editing and export
- Real-time LaTeX code preview
- Input data preview
- Local data persistence using Room database
- Clear data functionality to reset all entries

## System Workflow

1. User inputs resume data through a form interface
2. Data is stored locally using Room database
3. A LaTeX template is dynamically updated with user data
4. Generated LaTeX code is displayed and available for copying
5. Resume can be previewed or printed from the app
6. Users may reset the form to begin a new resume

**Diagram: System Workflow**


## Navigation Flow

The app follows a modular activity structure with intuitive navigation:

1. **Main Activity**: Entry point; provides access to all features
2. **Form Activity**: Resume detail input
3. **View Data Activity**: Review and edit previously saved data
4. **LaTeX Activity**: Display and copy generated LaTeX code
5. **Print Activity**: Preview and finalize resume
6. **Clear Data**: Remove all stored inputs

**Diagram: Navigation Flow**

## Implementation

### User Interface

- Developed using XML layouts in Android Studio
- Clean, responsive, and user-friendly design

### Functional Components

- **Form Entry Card**: Captures resume data through structured input fields
- **View Data Card**: Displays saved entries with options to edit or delete
- **LaTeX Code Card**: Presents generated LaTeX code with copy functionality
- **Overleaf Integration and Clear Data Card**: Exports LaTeX code to Overleaf; resets form data on request

### Data Management and Integration

- **Room Database** for secure local storage
- CRUD operations for managing user data
- Dynamic LaTeX template string updated in real time
- Integration with Overleaf for LaTeX resume editing and PDF export

## Technologies Used

- Android Studio
- Kotlin
- XML (UI Layouts)
- Room (Local Database)
- Overleaf (LaTeX Integration)
