package android.app.services;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Course_Description extends AppCompatActivity {
    TextView courseDescription, newCertificate, addRequirements, oldCertificate, courseRequirements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_description);

        courseDescription = findViewById(R.id.course_description);
        newCertificate = findViewById(R.id.new_certificate);
        oldCertificate = findViewById(R.id.old_certificate);
        addRequirements = findViewById(R.id.add_requirements);
        courseRequirements = findViewById(R.id.course_requirements);

        String course = getIntent().getStringExtra("selectedCourse");
            switch(course) {
                case "Diploma: Civil Engineering (ECP)":
                    this.getSupportActionBar().setTitle("Civil Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Civil Engineering (ECP)" +
                            "\n\nQualification Code: WS7110, WS6260" +
                            "\n\nCampus: Buffalo City, Butterworth" +
                            "\n\nOffering Type: Full Time" +
                            "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                                "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                "\n\nEnglish (Home or Additional Language) 3 (40-49)" +
                                "\n\nMathematics 4 (50-59)" +
                                "\n\nPhysical Science 4 (50-59)" +
                                "\n\nPoints: 30" +
                                "\n\nNBT Results: Required\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                            "\n\nMathematics HG-E or SG-D" +
                            "\n\nPhysical Science HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, LifeOrientation and Mathematics)." +
                            "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                            "\n\nConstruction Planning, Construction Supervision, Materials, Concrete Structure, Roads." +
                            "\n\nAn N3 certificate with C-symbols for at least four (4) subject including Mathematics and Engineering Science or D-symbol at N4 level of 3 Civil Engineering subjects + Mathematics, as well as the language requirements for Senior certificate.\n"
                    );
                    break;
                case "Diploma: Civil Engineering (Main)":
                    this.getSupportActionBar().setTitle("Civil Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Civil Engineering (Main)" +
                                    "\n\nQualification Code: WS7111, WS6261" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 4 (50-59)" +
                                    "\n\nPhysical Science 4 (50-59)" +
                                    "\n\nPoints: 30" +
                                    "\n\nNBT Results: Required\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, LifeOrientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nConstruction Planning, Construction Supervision, Materials, Concrete Structure, Roads." +
                                    "\n\nAn N3 certificate with C-symbols for at least four (4) subject including Mathematics and Engineering Science or D-symbol at N4 level of 3 Civil Engineering subjects + Mathematics, as well as the language requirements for Senior certificate.\n"
                    );
                    break;
                case "Advanced Diploma: Civil Engineering":
                    this.getSupportActionBar().setTitle("Civil Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in Civil Engineering" +
                                    "\n\nQualification Code: WS7112" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Part Time" +
                                    "\n\nDuration: 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet one of the following requirements:" +
                                    "\n\nCandidates should have accumulated at least one year of appropriate post diploma experience and:" +
                                    "\n\n1. A revised National Diploma: Engineering: Civil (S-stream), or its equivalent OR" +
                                    "\n\n2. A National Higher Diploma: Civil Engineering (T4) with the appropriate courses at this level for the field of specialisation the candidate wishes to pursue OR" +
                                    "\n\n3. A National Diploma: Civil Engineering (T3) with four (4) S4-level courses approved by the Head of Department and sufficient appropriate experience in lieu of the other two outstanding S4 courses." +
                                    "\n\nNewly qualified diplomats who wish to proceed directly to the Advanced Diploma programme without the appropriate post diploma experience requirements may be admitted if they obtained an average of at least 60% in their Level 3 (P2 & S4) courses." +
                                    "\n\nHowever, admission is not automatic, as candidates will be selected on the basis of their proven academic record and post-qualification professional experience.\n"
                    );
                    break;
                case "Diploma: Building (ECP)":
                    this.getSupportActionBar().setTitle("Building");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Building Technology (ECP)" +
                                    "\n\nQualification Code: WS7114, WS6250" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nPhysical Science 3 (40-49)" +
                                    "\n\nWoodwork 3 (40-49)" +
                                    "\n\nEngineering and Graphics 3 (40-49)" +
                                    "\n\nNBT Results: Required\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                            "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                            "\n\nConstruction Planning, Construction Supervision, Materials, Concrete Structure, Carpentry and roof work, Masonry, Plumbing" +
                            "\n\nAn N3 certificate with C-symbols (6069) for at least four (4) subjects including Mathematics and Engineering or Building Science, 4 Building/Civil Engineering subjects at D-symbol (5059) at N4 & N5 level, E-symbol (40-49) at N6 level.\n"
                    );
                    break;
                case "Diploma: Building (Main)":
                    this.getSupportActionBar().setTitle("Building");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Building Technology (Main)" +
                                    "\n\nQualification Code: WS7113, WS6251" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nPhysical Science 3 (40-49)" +
                                    "\n\nWoodwork 3 (40-49)" +
                                    "\n\nEngineering and Graphics 3 (40-49)" +
                                    "\n\nNBT Results: Required\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nConstruction Planning, Construction Supervision, Materials, Concrete Structure, Carpentry and roof work, Masonry, Plumbing" +
                                    "\n\nAn N3 certificate with C-symbols (6069) for at least four (4) subjects including Mathematics and Engineering or Building Science, 4 Building/Civil Engineering subjects at D-symbol (5059) at N4 & N5 level, E-symbol (40-49) at N6 level.\n"
                    );
                    break;
                case "Diploma: Electrical Engineering (ECP)":
                    this.getSupportActionBar().setTitle("Electrical Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Electrical Engineering (ECP)" +
                                    "\n\nQualification Code: WS7130, WS6211" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 3 (40-49)" +
                                    "\n\nMathematics 4 (50-59)" +
                                    "\n\nPhysical Science 4 (50-59)" +
                                    "\n\nNBT Results: For Profiling Purposes\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D" +
                                    "\n\nIf the symbol attained for only one of either Mathematics or Physical Science is one symbol below the requirement, the student may be referred to the Diploma in Engineering: Electrical (Extended Programme)\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nPhysical Science, Electrical Principles and Practice, Electrical workmanship, Electronic Control and Digital Electronics, Electrical Systems and Construction or Electro-Technology\n"
                    );
                    break;
                case "Diploma: Electrical Engineering (Main)":
                    this.getSupportActionBar().setTitle("Electrical Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Electrical Engineering (Main)" +
                                    "\n\nQualification Code: WS7131, WS6212" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 3 (40-49)" +
                                    "\n\nMathematics 4 (50-59)" +
                                    "\n\nPhysical Science 4 (50-59)" +
                                    "\n\nNBT Results: For Profiling Purposes\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D" +
                                    "\n\nIf the symbol attained for only one of either Mathematics or Physical Science is one symbol below the requirement, the student may be referred to the Diploma in Engineering: Electrical (Extended Programme)\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nPhysical Science, Electrical Principles and Practice, Electrical workmanship, Electronic Control and Digital Electronics, Electrical Systems and Construction or Electro-Technology\n"
                    );
                    break;
                case "Advanced Diploma: Electrical Engineering":
                    this.getSupportActionBar().setTitle("Electrical Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in Electrical Engineering" +
                                    "\n\nQualification Code: WS7132" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Part Time" +
                                    "\n\nDuration: 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet one of the following requirements:" +
                                    "\n\n1. Diploma in Electrical Engineering" +
                                    "\n\n2. National Diploma: Engineering: Electrical, including a credit for Mathematics III, and with an overall average for all courses of at least 60%" +
                                    "\n\n3. Old National Diploma(T3): Electrical Engineering: Heavy Current, plus enough additional courses to accumulate at least 20 credits, including Engineering Mathematics III and Design Project III, or their equivalents, and with an overall average for all courses of at least 60%" +
                                    "\n\n4. National Higher Diploma: Electrical : Heavy or Light Current, including a credit for Engineering Mathematics IV or at least Engineering Mathematics III" +
                                    "\n\nAny applicant who has a National Diploma plus two years’ work experience in a related field, but fails to meet the average mark of 60% will have his/her application reviewed by a panel to determine whether he/she can be admitted or not\n"
                    );
                    break;
                case "Diploma: Mechanical Engineering (ECP)":
                    this.getSupportActionBar().setTitle("Mechanical Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Mechanical Engineering (ECP)" +
                                    "\n\nQualification Code: WS7153, WS6221" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 4 (50-59)" +
                                    "\n\nPhysical Science 4 (50-59)" +
                                    "\n\nNBT Results: Required\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D" +
                                    "\n\nIf the symbol attained for only one of either Mathematics or Physical Science is one symbol below the requirement, the student may be referred to the Diploma in Engineering: Electrical (Extended Programme)\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nEngineering Processes, Engineering Technology, Fitting and Turning, Automotive Repair, Engine Fabrication-Boiler Making or Sheet Metal worker, Welding, Refrigeration and Air Conditioning Process, Electro-Technology, Computer  Integrated Manufacturing, or Mechatronics Systems.\n"
                    );
                    break;
                case "Diploma: Mechanical Engineering (Main)":
                    this.getSupportActionBar().setTitle("Mechanical Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Mechanical Engineering (Main)" +
                                    "\n\nQualification Code: WS7151, WS6222" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 4 (50-59)" +
                                    "\n\nPhysical Science 4 (50-59)" +
                                    "\n\nNBT Results: Required\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SG-D" +
                                    "\n\nPhysical Science HG-E or SG-D" +
                                    "\n\nIf the symbol attained for only one of either Mathematics or Physical Science is one symbol below the requirement, the student may be referred to the Diploma in Engineering: Electrical (Extended Programme)\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nEngineering Processes, Engineering Technology, Fitting and Turning, Automotive Repair, Engine Fabrication-Boiler Making or Sheet Metal worker, Welding, Refrigeration and Air Conditioning Process, Electro-Technology, Computer  Integrated Manufacturing, or Mechatronics Systems.\n"
                    );
                    break;
                case "Advanced Diploma: Mechanical Engineering":
                    this.getSupportActionBar().setTitle("Mechanical Engineering");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in Mechanical Engineering" +
                                    "\n\nQualification Code: WS7132" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Part Time" +
                                    "\n\nDuration: 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet one of the following requirements:" +
                                    "\n\n1. A revised National Diploma: Engineering: Mechanical (S-stream), or its equivalent OR" +
                                    "\n\n2. National Higher Diploma: Mechanical Engineering (T4) with the appropriate courses at this level for the field of specialisation the candidate wishes to pursue OR" +
                                    "\n\n3. National Diploma: Mechanical Engineering (T3) with at least two (2) of the following S4level courses: Applied Strength of Material III, Steam Plant III, Hydraulic Machines III and Mathematics III" +
                                    "\n\nNewly qualified Diplomats (Engineering Mechanical) who wish to proceed directly to the Advanced Diploma programme without the experiential training requirements may be admitted if they obtained an average of at least 60% in their Level III courses.  However, admission is not automatic, as candidates will be selected on the basis of their proven academic record and post qualification professional experience.\n"
                    );
                    break;
                case "Diploma: ICT Business Analysis (ECP)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Business Analysis (ECP)" +
                                    "\n\nQualification Code: WS7172, WS6269" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Diploma: ICT Business Analysis (Main)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Business Analysis (Main)" +
                                    "\n\nQualification Code: WS7166, WS6263" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Diploma: ICT Applications Development (ECP)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Applications Development (ECP)" +
                                    "\n\nQualification Code: WS7169, WS6268, WS4123" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Diploma: ICT Applications Development (Main)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Applications Development (Main)" +
                                    "\n\nQualification Code: WS7165, WS6262, WS4122" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Advanced Diploma: ICT Applications Development":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in ICT Applications Development" +
                                    "\n\nQualification Code: WS7170, WS6265" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time / Part Time" +
                                    "\n\nDuration: 1 / 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet the following requirements:" +
                                    "\n\nNational Diploma: Information Technology or Diploma in Information Technology, or an equivalent qualification at NQF Level 6 in a cognate discipline.\n"
                    );
                    break;
                case "Diploma: ICT Support Services (ECP)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Support Services (ECP)" +
                                    "\n\nQualification Code: WS7174" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Diploma: ICT Support Services (Main)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Support Services (Main)" +
                                    "\n\nQualification Code: WS7168" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Diploma: ICT Communication Networks (ECP)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Communication Networks (ECP)" +
                                    "\n\nQualification Code: WS7173, WS6270" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Diploma: ICT Communication Networks (Main)":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in ICT Communication Networks (Main)" +
                                    "\n\nQualification Code: WS7167, WS6264" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy: 4 (60-69)\n");
                    oldCertificate.setText(
                            "\n\nEnglish First language HGE or SG-D OR" +
                                    "\n\nEnglish second language HG-D or SG-C" +
                                    "\n\nMathematics HG-E or SG-D\n");
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics OR 60% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nSystems Analysis and Design, Data Communication and networking, Computer programming, Physical Science\n"
                    );
                    break;
                case "Advanced Diploma: ICT Communication Networks":
                    this.getSupportActionBar().setTitle("Information Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in ICT Communication Networks" +
                                    "\n\nQualification Code: WS7171" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time / Part Time" +
                                    "\n\nDuration: 1 / 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet the following requirements:" +
                                    "\n\nNational Diploma: Information Technology or Diploma in Information Technology, or an equivalent qualification at NQF Level 6 in a cognate discipline.\n"
                    );
                    break;
                case "Diploma: Fashion Design":
                    this.getSupportActionBar().setTitle("Fashion Design");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Fashion Design" +
                                    "\n\nQualification Code: WS7122, WS6231" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nAchievement rating of at least: 4 (50-59) in English as Home Language or Additional Language" +
                                    "\n\nMathematics: 2 (30-39) OR" +
                                    "\n\nAccountancy for costing fabric and garment and promotion purposes 2 (30-39) OR" +
                                    "\n\nMathematical Literacy: 3 (40-49)\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nMathematics HG-E or SGD\n");
                    addRequirements.setText(
                            "\n\nPass all 2 Fundamental subjects with 50% and above (English, Mathematics OR Mathematical Literacy)." +
                                    "\n\nPass with:" +
                                    "\n\nEnglish: 4 (50-59)" +
                                    "\n\nMathematics:2 (30-39)" +
                                    "\n\nMathematics Literacy: 3 (40-49) OR" +
                                    "\n\nAccounting: 2 (30-39)" +
                                    "\n\nGraduates for FET colleges with N6 qualification in related field of which all N5 and N6 obtained a minimum of 50%, are allowed to submit their academic records and apply for credits for first year study D Fashion Design.\n"
                    );
                    break;
                case "Diploma: Fine Art":
                    this.getSupportActionBar().setTitle("Fine Art");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Fine Art" +
                                    "\n\nQualification Code: WS7120" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\nEnglish Home or Additional language: 3 (40-49)\n");
                    oldCertificate.setText(
                            "\n\nEnglish HG-E\n");
                    addRequirements.setText(
                            "\n\nMeet statutory requirements for NC(V) level:" +
                                    "\n\nGraduates for FET colleges with N6 qualification in related field of which all N5 and N6 obtained a minimum of 50% are allowed to submit their academic record and apply for credits for first year study ND: Fine Art.\n"
                    );
                    break;
                case "Advanced Diploma: Fine Art":
                    this.getSupportActionBar().setTitle("Fine Art");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in Fine Art" +
                                    "\n\nQualification Code: WS7121" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 1\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet the following requirements:" +
                                    "\n\n1.An acceptable National Diploma/ Diploma: Fine Arts or equivalent qualification." +
                                    "\n\n2. Applicants from other institutions will be required to present a portfolio of previous work." +
                                    "\n\n3. An average of 65% at National Diploma level is the general guide-line allowing consideration for admission." +
                                    "\n\n4. Application should include a substantial Research Project Proposal.\n"
                    );
                    break;
                case "Diploma: Analytical Chemistry (ECP)":
                    this.getSupportActionBar().setTitle("Analytical Chemistry");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Analytical Chemistry (ECP)" +
                                    "\n\nQualification Code: WS7162" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nA prospective student must have an NSC achievement rating of at least 3 (40-49) in each of the following subjects:" +
                                    "\n\nEnglish (as a home language or first additional language level)" +
                                    "\n\nMathematics" +
                                    "\n\nPhysical Science\n");
                    oldCertificate.setText(
                            "\n\nE – in English (HG)(Second Language)" +
                            "\n\nD – symbol (SG) or E – symbol (HG) in Life Sciences/Biology" +
                            "\n\nD – symbol (SG) or E – symbol (HG) in Physical Sciences\n");
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Diploma: Analytical Chemistry (Main)":
                    this.getSupportActionBar().setTitle("Analytical Chemistry");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Analytical Chemistry (Main)" +
                                    "\n\nQualification Code: WS7161" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nA prospective student must have an NSC achievement rating of at least 3 (40-49) in each of the following subjects:" +
                                    "\n\nEnglish (as a home language or first additional language level)" +
                                    "\n\nMathematics" +
                                    "\n\nPhysical Science\n");
                    oldCertificate.setText(
                            "\n\nE – in English (HG)(Second Language)" +
                                    "\n\nD – symbol (SG) or E – symbol (HG) in Life Sciences/Biology" +
                                    "\n\nD – symbol (SG) or E – symbol (HG) in Physical Sciences\n");
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Advanced Diploma: Analytical Chemistry":
                    this.getSupportActionBar().setTitle("Analytical Chemistry");
                    courseDescription.setText(
                            "\n\nQualification Name: Advanced Diploma in Analytical Chemistry" +
                                    "\n\nQualification Code: WS7160" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 1\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nCandidate should meet the following requirements:" +
                                    "\n\nNewly qualified diplomats who wish to proceed directly to the Advanced Diploma programme without the appropriate post diploma industrial experience requirements may be admitted if they obtained an average of at least 60% in their exit level courses (Analytical Chemistry III theory and practical, Inorganic Chemistry III, Organic Chemistry III and Physical Chemistry III)." +
                                    "\n\nHowever, candidates with a relevant one-year industrial experience and an average of at least 55% in their exit level courses will be considered for admission." +
                                    "\n\nNote that admission is not automatic, candidates will be selected on the basis of their proven academic record and/or post qualification professional experience.\n"
                    );
                    break;
                case "Diploma: Consumer Science (ECP)":
                    this.getSupportActionBar().setTitle("Consumer Science");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Consumer Science - Food and Nutrition (ECP)" +
                                    "\n\nQualification Code: WS7163" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma Compulsory)" +
                                    "\n\nEnglish: 4 (50-59)"+
                                    "\n\nLife Sciences: 3 (40-49)"+
                                    "\n\nPhysical Sciences: 3 (40-49)" +
                                    "\n\nRecommended NSC Subjects (Not compulsory):" +
                                    "\n\nConsumer / Hospitality studies: 3 (40-49)"+
                                    "\n\nMathematics / Maths literacy: 3 (40-49)"+
                                    "\n\nAccounting: 3 (40-49)" +
                                    "\n\nIn addition to the Grade 12 results, interviews will be used for selection and placement purposes.\n"
                            );
                    oldCertificate.setText(
                            "\n\nE – symbol (HG) in English (Second Language)"+
                            "\n\nD – symbol (SG) or E – symbol (HG) in Life Sciences/Biology"+
                            "\n\nD – symbol (SG) or E – symbol (HG) in Physical Sciences"+
                            "\n\nIn addition to the Grade 12 results, interviews will be used for selection and placement purposes.\n"
                    );
                    addRequirements.setText(
                            "\n\nGraduates from FET College with a N6 qualification in the related field of which all N5 and N6 obtained a minimum of 50%, are allowed to submit their academic records and apply for the credits of first year of study in the ND Consumer Sciences: Food and Nutrition\n"
                    );
                    break;
                case "Diploma: Consumer Science (Main)":
                    this.getSupportActionBar().setTitle("Consumer Science");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Consumer Science - Food and Nutrition (Main)" +
                                    "\n\nQualification Code: WS7164" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma Compulsory)" +
                                    "\n\nEnglish: 4 (50-59)"+
                                    "\n\nLife Sciences: 3 (40-49)"+
                                    "\n\nPhysical Sciences: 3 (40-49)" +
                                    "\n\nRecommended NSC Subjects (Not compulsory):" +
                                    "\n\nConsumer / Hospitality studies: 3 (40-49)"+
                                    "\n\nMathematics / Maths literacy: 3 (40-49)"+
                                    "\n\nAccounting: 3 (40-49)" +
                                    "\n\nIn addition to the Grade 12 results, interviews will be used for selection and placement purposes.\n"
                    );
                    oldCertificate.setText(
                            "\n\nE – symbol (HG) in English (Second Language)"+
                                    "\n\nD – symbol (SG) or E – symbol (HG) in Life Sciences/Biology"+
                                    "\n\nD – symbol (SG) or E – symbol (HG) in Physical Sciences"+
                                    "\n\nIn addition to the Grade 12 results, interviews will be used for selection and placement purposes.\n"
                    );
                    addRequirements.setText(
                            "\n\nGraduates from FET College with a N6 qualification in the related field of which all N5 and N6 obtained a minimum of 50%, are allowed to submit their academic records and apply for the credits of first year of study in the ND Consumer Sciences: Food and Nutrition\n"
                    );
                    break;
                case "Diploma: Management (ECP)":
                    this.getSupportActionBar().setTitle("Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Management (ECP)" +
                                    "\n\nQualification Code: WS7055, WS6042, WS5050" +
                                    "\n\nCampus: Buffalo City, Butterworth, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree / Diploma)" +
                                    "\n\nEnglish: 3 (40-49%)"+
                                    "\n\nAccounting: 2 (30-39%)"+
                                    "\n\nMathematics: 2 (30-39%)"+
                                    "\n\nMathematics Literacy: 3 (40-49%)"+
                                    "\n\n3 (40-49) in any TWO of the following subjects:"+
                                    "\n\nAgricultural Science" +
                                    "\n\nBusiness Studies" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nLife science" +
                                    "\n\nPhysical Science\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E" +
                                    "\n\nMathematics pass E OR" +
                                    "\n\nAccounting SG- E" +
                                    "\n\nSG-E in any three of the following:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBiblical Studies" +
                                    "\n\nBiology" +
                                    "\n\nBusiness Economics" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nMercantile Law" +
                                    "\n\nPhysical Science"+
                                    "\n\nApplied Accounting" +
                                    "\n\nEconomic Environment" +
                                    "\n\nFinancial Management" +
                                    "\n\nNew Venture Creation\n"
                    );
                    addRequirements.setText("\n\nN/A\n");
                    break;
                case "Diploma: Management (Main)":
                    this.getSupportActionBar().setTitle("Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Management (Main)" +
                                    "\n\nQualification Code: WS7033, WS6024, WS5025" +
                                    "\n\nCampus: Buffalo City, Butterworth, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nNSC pass with a Diploma or Bachelor’s degree endorsement:" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n3 (40-49%) English" +
                                    "\n\n3 (40-49%) Accounting OR" +
                                    "\n\n3 (40-49%) Mathematics OR" +
                                    "\n\n3 (40-49%)Mathematics Literacy" +
                                    "\n\n3 (40-49) in any TWO of the following subjects:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBusiness Studies" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nLife science" +
                                    "\n\nPhysical Science\n"
                    );
                    oldCertificate.setText(
                                    "\n\nEnglish HG-E" +
                                    "\n\nMathematics pass SG-E OR" +
                                    "\n\nAccounting SG-E" +
                                            "\n\nSG-E in any three of the following:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBiblical Studies" +
                                    "\n\nBiology" +
                                    "\n\nBusiness Economics" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nMercantile Law" +
                                    "\n\nPhysical Science\n"
                    );
                    addRequirements.setText(
                            "\n\nApplicants with National Certificate Vocational (NCV) Level 4:" +
                                    "\n\n1 Fundamental Component:" +
                                    "\n\nAchievement of 50% in the following subjects:" +
                                    "\n\nEnglish" +
                                    "\n\nLife Orientation" +
                                    "\n\nMathematics OR Mathematical Literacy" +
                                    "\n\n2 Vocational Component:" +
                                    "\n\nAchievement of 60% in THREE compulsory vocational subjects from either of the following streams:" +
                                    "\n\nManagement  Stream" +
                                    "\n\nFinancial Management" +
                                    "\n\nManagement Practice" +
                                    "\n\nOperations Management" +
                                    "\n\nProject Management" +
                                    "Finance, Economics & Accounting Stream \n"
                    );
                    break;
                case "Diploma: Public Management":
                    this.getSupportActionBar().setTitle("Public Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Public Management" +
                                    "\n\nQualification Code: WS7031, WS6031, WS4106, WS5048" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown, Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement NSC: Degree/ Diploma."+
                                    "\n\nAchievement rating of at least:"+
                                    "\n\n3 (40-49%) English and 3 in any two recognized subjects." +
                                    "\n\n3 (40-49%) in four recognized school subjects\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LO" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n70% or more for Mathematics Literacy\n"
                    );
                    break;
                case "Diploma: Human Resources Management (ECP)":
                    this.getSupportActionBar().setTitle("Human Resources Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Human Resources Management (ECP)" +
                                    "\n\nQualification Code: WS6044, WS4103, WS5023" +
                                    "\n\nCampus: Butterworth, Qeenstown, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nNSC pass with a Diploma or Bachelor’s degree endorsement." +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n3 (40-49%) English" +
                                    "\n\n2 (30-39%) Mathematics OR" +
                                    "\n\n3 (40 - 49%) Mathematical Literacy OR" +
                                    "\n\n2 (30 - 39%) Accounting" +
                                    "\n\n3 (40 - 49%) in any TWO, AND 2 (30 – 39%) in ONE of the following recommended subjects:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBusiness Studies" +
                                    "\n\nComputer Applications Technology (CAT)" +
                                    "\n\nConsumer Studies" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nHome Language" +
                                    "\n\nLife science" +
                                    "\n\nPhysical Science\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E" +
                                    "\n\nMathematics pass SG-F OR" +
                                    "\n\nAccounting SG-F AND" +
                                    "\n\nSG-E in any TWO of the following:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBiblical Studies" +
                                    "\n\nBiology" +
                                    "\n\nBusiness Economics" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nHome Language" +
                                    "\n\nMercantile Law" +
                                    "\n\nPhysical Science\n"
                    );
                    addRequirements.setText(
                            "\n\nApplicants with National Certificate Vocational (NCV) Level 4" +
                                    "\n\n1 Fundamental Component: 50% in the following subjects:" +
                                    "\n\nEnglish" +
                                    "\n\nLife Orientation and" +
                                    "\n\nMathematics OR" +
                                    "\n\nMathematical Literacy" +
                                    "\n\n2. Vocational Component:" +
                                    "\n\nAchievement of 60% in THREE compulsory vocational subjects from either of the following streams:" +
                                    "\n\nOffice Administration Stream" +
                                    "\n\nBusiness Practice" +
                                    "\n\nOffice Data Processing" +
                                    "\n\nOffice Practice" +
                                    "\n\nManagement Stream" +
                                    "\n\nFinancial Management" +
                                    "\n\nManagement Practice" +
                                    "\n\nOperations Management" +
                                    "\n\nProject Management\n"
                    );
                    break;
                case "Diploma: Human Resources Management (Main)":
                    this.getSupportActionBar().setTitle("Human Resources Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Human Resources Management (Main)" +
                                    "\n\nQualification Code: WS6023, WS7023, WS4116, WS5024" +
                                    "\n\nCampus: Butterworth, Buffalo City, Qeenstown, Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nNSC pass with a Diploma or Bachelor’s degree endorsement." +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n3 (40-49%) English" +
                                    "\n\n2 (30-39%) Mathematics OR" +
                                    "\n\n4 (50 - 59%) Mathematical Literacy OR" +
                                    "\n\n2 (30 - 39%) Accounting" +
                                    "\n\n3 (40 - 49%) in any TWO, AND 2 (30 – 39%) in ONE of the following recommended subjects:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBusiness Studies" +
                                    "\n\nComputer Applications Technology (CAT)" +
                                    "\n\nConsumer Studies" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nHome Language" +
                                    "\n\nLife science" +
                                    "\n\nPhysical Science\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E" +
                                    "\n\nMathematics pass SG-E OR" +
                                    "\n\nAccounting SG-E AND" +
                                    "\n\nSG-E in any THREE of the following:" +
                                    "\n\nAgricultural Science" +
                                    "\n\nBiblical Studies" +
                                    "\n\nBiology" +
                                    "\n\nBusiness Economics" +
                                    "\n\nEconomics" +
                                    "\n\nGeography" +
                                    "\n\nHistory" +
                                    "\n\nHome Language" +
                                    "\n\nMercantile Law" +
                                    "\n\nPhysical Science\n"
                    );
                    addRequirements.setText(
                            "\n\nApplicants with National Certificate Vocational (NCV) Level 4" +
                                    "\n\n1 Fundamental Component: 50% in the following subjects:" +
                                    "\n\nEnglish" +
                                    "\n\nLife Orientation and" +
                                    "\n\nMathematics OR" +
                                    "\n\nMathematical Literacy" +
                                    "\n\n2. Vocational Component:" +
                                    "\n\nAchievement of 60% in THREE compulsory vocational subjects from either of the following streams:" +
                                    "\n\nOffice Administration Stream" +
                                    "\n\nBusiness Practice" +
                                    "\n\nOffice Data Processing" +
                                    "\n\nOffice Practice" +
                                    "\n\nManagement Stream" +
                                    "\n\nFinancial Management" +
                                    "\n\nManagement Practice" +
                                    "\n\nOperations Management" +
                                    "\n\nProject Management\n"
                    );
                    break;
                case "Diploma: Office Management and Technology (ECP)":
                    this.getSupportActionBar().setTitle("Office Management & Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Office Management and Technology (ECP)" +
                                    "\n\nQualification Code: WS6033, WS5051" +
                                    "\n\nCampus: Butterworth, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nEnglish (Additional Language): 4 (50-59)" +
                                    "\n\nEnglish home language: 3 (40-49)" +
                                    "\n\nAccounting: 4 (50-59)" +
                                    "\n\nBusiness Studies: 4 (50-59)" +
                                    "\n\nComputer Applications Technology: 4 (50-59)" +
                                    "\n\nEconomics: 4 (50-59)" +
                                    "\n\nInformation Technology: 4 (50-59)" +
                                    "\n\nAgricultural Science: 4 (50-59)" +
                                    "\n\nAgricultural Technology: 4 (50-59)" +
                                    "\n\nConsumer Studies: 4 (50-59)" +
                                    "\n\nGeography: 4 (50-59)" +
                                    "\n\nHistory: 4 (50-59)" +
                                    "\n\nHospitality Studies: 4 (50-59)" +
                                    "\n\nLife Sciences: 4 (50-59)" +
                                    "\n\nPhysical Sciences: 4 (50-59)" +
                                    "\n\nTourism: 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy 4 (50-59)" +
                                    "\n\nSUBJECT TO A PLACEMENT TEST\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nPasses in:" +
                                    "\n\nAccounting," +
                                    "\n\nBusiness Studies," +
                                    "\n\nComputer Typing," +
                                    "\n\nand Economics will be added advantage." +
                                    "\n\nPreference will be given to learners with at least 50% grade aggregate." +
                                    "\n\nLearners only with a minimum aggregate of 950 will be considered." +
                                    "\n\nSUBJECT TO A PLACEMENT TEST\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) relevant vocational subjects:" +
                                    "\n\nBusiness Practice, Office Practice, Office Data Processing, etc." +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n60% for Mathematics Literacy" +
                                    "\n\nSUBJECT TO A PLACEMENT TEST\n"
                    );
                    break;
                case "Diploma: Office Management and Technology (Main)":
                    this.getSupportActionBar().setTitle("Office Management & Technology");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Office Management and Technology (Main)" +
                                    "\n\nQualification Code: WS6032, WS7025, WS5047" +
                                    "\n\nCampus: Butterworth, Buffalo City, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nEnglish (Additional Language): 4 (50-59)" +
                                    "\n\nEnglish home language: 3 (40-49)" +
                                    "\n\nAccounting: 4 (50-59)" +
                                    "\n\nBusiness Studies: 4 (50-59)" +
                                    "\n\nComputer Applications Technology: 4 (50-59)" +
                                    "\n\nEconomics: 4 (50-59)" +
                                    "\n\nInformation Technology: 4 (50-59)" +
                                    "\n\nAgricultural Science: 4 (50-59)" +
                                    "\n\nAgricultural Technology: 4 (50-59)" +
                                    "\n\nConsumer Studies: 4 (50-59)" +
                                    "\n\nGeography: 4 (50-59)" +
                                    "\n\nHistory: 4 (50-59)" +
                                    "\n\nHospitality Studies: 4 (50-59)" +
                                    "\n\nLife Sciences: 4 (50-59)" +
                                    "\n\nPhysical Sciences: 4 (50-59)" +
                                    "\n\nTourism: 4 (50-59)" +
                                    "\n\nMathematics 3 (40-49)" +
                                    "\n\nMathematical Literacy 4 (50-59)" +
                                    "\n\nSUBJECT TO A PLACEMENT TEST\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nPasses in:" +
                                    "\n\nAccounting," +
                                    "\n\nBusiness Studies," +
                                    "\n\nComputer Typing," +
                                    "\n\nand Economics will be added advantage." +
                                    "\n\nPreference will be given to learners with at least 50% grade aggregate." +
                                    "\n\nLearners only with a minimum aggregate of 950 will be considered." +
                                    "\n\nSUBJECT TO A PLACEMENT TEST\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) relevant vocational subjects:" +
                                    "\n\nBusiness Practice, Office Practice, Office Data Processing, etc." +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n60% for Mathematics Literacy" +
                                    "\n\nSUBJECT TO A PLACEMENT TEST\n"
                    );
                    break;
                case "Diploma: Tourism Management":
                    this.getSupportActionBar().setTitle("Tourism Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Tourism Management" +
                                    "\n\nQualification Code: WS7051, WS6040" +
                                    "\n\nCampus: Buffalo City, Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 3 (40-49)," +
                                    "\n\nAchievement rating of 3 (40-49) in any 3 of the following school subjects:" +
                                    "\n\n1. Tourism, History, Geography" +
                                    "\n\n2.Business Studies, Accounting, Economics" +
                                    "\n\n3.Mathematics Mathematical Literacy\n"
                    );
                    oldCertificate.setText(
                            "\n\nPass with HG-E or SG-D in English, and E in any three (3) of the following:" +
                                    "\n\n1. History, Geography, Tourism" +
                                    "\n\n2. Accounting, Economics, Business Economics" +
                                    "\n\n3. Mathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics or Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nClient Service and Human Relations L4, Science of Tourism L4, Sustainable Tourism in SA & International Travel L4 and Tourism Operations L4.\n"
                    );
                    break;
                case "Diploma: Public Relations Management (ECP)":
                    this.getSupportActionBar().setTitle("Public Relations Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Public Relations Management (ECP)" +
                                    "\n\nQualification Code: WS7048, WS5044" +
                                    "\n\nCampus: Buffalo City, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement in two (2) languages:" +
                                    "\n\nEnglish, isiXhosa or Afrikaans" +
                                    "\n\nPlacement based on performance in NBT\n"
                    );
                    oldCertificate.setText(
                            "\n\nN/A\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n70% or more for Mathematics Literacy \n"
                    );
                    break;
                case "Diploma: Public Relations Management (Main)":
                    this.getSupportActionBar().setTitle("Public Relations Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Public Relations Management (Main)" +
                                    "\n\nQualification Code: WS7047, WS5045" +
                                    "\n\nCampus: Buffalo City, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement in two (2) languages:" +
                                    "\n\nEnglish, isiXhosa or Afrikaans" +
                                    "\n\nPlacement based on performance in NBT\n"
                    );
                    oldCertificate.setText(
                            "\n\nN/A\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n70% or more for Mathematics Literacy \n"
                    );
                    break;
                case "Diploma: Policing":
                    this.getSupportActionBar().setTitle("Policing");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Policing" +
                                    "\n\nQualification Code: WS7035" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 3 (40-49)" +
                                    "\n\nAchievement rating of 3 (40-49) in four (4) of the following subjects:" +
                                    "\n\nLife orientation," +
                                    "\n\nLife science," +
                                    "\n\nBusiness Studies," +
                                    "\n\nEconomics," +
                                    "\n\nGeography," +
                                    "\n\nHistory," +
                                    "\n\nTourism\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nBusiness Practice, Office Data Processing, Office Practice, Financial Management, Management Practice, Operations Management, Project Management\n"
                    );
                    break;
                case "Diploma: Small Business Management":
                    this.getSupportActionBar().setTitle("Small Business Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Small Business Management" +
                                    "\n\nQualification Code: WS7036" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nEnglish (Home or Additional Language) 3(40-49)" +
                                    "\n\nAchievement rating of 3 (40-49) in  any  two commercial business related subjects:" +
                                    "\n\n3 (40-49) in Mathematics Literacy or" +
                                    "\n\n2 (30-39) in Mathematics\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nBusiness Practice, Office Data Processing, Office Practice, Financial Management, Management Practice, Operations Management, Project Management \n"
                    );
                    break;
                case "Diploma: Local Government Finance (ECP)":
                    this.getSupportActionBar().setTitle("Local Government Finance");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Local Government Finance (ECP)" +
                                    "\n\nQualification Code: WS7054, WS4114" +
                                    "\n\nCampus: Buffalo City, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n1st Option:" +
                                    "\n\n3 (40-49%) English," +
                                    "\n\n2 (30-39%) Accounting OR" +
                                    "\n\n2 (30-39%) Mathematics" +
                                    "\n\nAND  3 (40-49%) in other two subjects:" +
                                    "\n\nPhysical Science," +
                                    "\n\nLife science," +
                                    "\n\nBusiness Studies," +
                                    "\n\nEconomics," +
                                    "\n\nGeography," +
                                    "\n\nHistory" +
                                    "\n\n2nd Option:" +
                                    "\n\n3 (40- 49%) English," +
                                    "\n\n3 (40-49%) Mathematics Literacy and" +
                                    "\n\n2 (30-39%) Accounting AND" +
                                    "\n\n3 (40- 49) in other two subjects:" +
                                    "\n\nPhysical Science," +
                                    "\n\nLife science," +
                                    "\n\nBusiness Studies" +
                                    "\n\nEconomics," +
                                    "\n\nGeography," +
                                    "\n\nHistory\n"
                    );
                    oldCertificate.setText(
                            "\n\nN/A\n"
                    );
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Diploma: Local Government Finance (Main)":
                    this.getSupportActionBar().setTitle("Local Government Finance");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Local Government Finance (Main)" +
                                    "\n\nQualification Code: WS7032, WS4109" +
                                    "\n\nCampus: Buffalo City< Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n1st Option:" +
                                    "\n\n3(40-49%) English," +
                                    "\n\n3(40-49%)Accounting OR " +
                                    "\n\n3(40-49%) Mathematics" +
                                    "\n\nAND  3(40-49) in other two subjects:" +
                                    "\n\nPhysical Science," +
                                    "\n\nLife science," +
                                    "\n\nBusiness Studies," +
                                    "\n\nEconomics," +
                                    "\n\nGeography," +
                                    "\n\nHistory" +
                                    "\n\n2nd Option:" +
                                    "\n\n3 (40- 49%) English," +
                                    "\n\n4 (50-59%) Mathematics Literacy," +
                                    "\n\n3 (40- 49%)  Accounting" +
                                    "\n\nAND  3 (40- 49) in other two subjects:" +
                                    "\n\nPhysical Science," +
                                    "\n\nLife science," +
                                    "\n\nBusiness Studies," +
                                    "\n\nEconomics," +
                                    "\n\nGeography," +
                                    "\n\nHistory \n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D," +
                                    "\n\nMathematics HG-E or SGD" +
                                    "\n\nAccounting HG-E \n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nBusiness Practice, Office Data Processing, Office Practice, Financial Management, Management Practice, Operations Management, Project Management\n"
                    );
                    break;
                case "Diploma: Administrative Management":
                    this.getSupportActionBar().setTitle("Administrative Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Administrative Management" +
                                    "\n\nQualification Code: WS7022" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of English (Home Language) 3 (40-49)," +
                                    "\n\nEnglish (Additional Language) 4 (50-59)," +
                                    "\n\n3 (40-49) Life Orientation," +
                                    "\n\n2 (30-39) Accounting OR" +
                                    "\n\n2 (30-39) Mathematics OR " +
                                    "\n\n3 (40-49) Mathematical Literacy" +
                                    "\n\nAnd at least one (1) of the following subjects with a minimum rating of 3 (40-49):" +
                                    "\n\nEconomics," +
                                    "\n\nBusiness Studies\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D," +
                                    "\n\nAnd at least one of the following school subjects:" +
                                    "\n\nBusiness Studies," +
                                    "\n\nEconomics," +
                                    "\n\nAccounting," +
                                    "\n\nMathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics or 70% for Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects and at least 50% for the fourth subject." +
                                    "\n\nThe certificate must be in any of the following fields:" +
                                    "\n\nManagement, marketing, hospitality, tourism, office administration, information technology, computer science, finance, economics or accounting.\n"
                    );
                    break;
                case "Diploma: Marketing Management":
                    this.getSupportActionBar().setTitle("Marketing Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Marketing Management" +
                                    "\n\nQualification Code: WS7044" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n3 (40-49) English," +
                                    "\n\n3 (40-49) in four (4) recognised 20-credit subjects:" +
                                    "\n\n3 (40-49) Mathematics Literacy or" +
                                    "\n\n2 (30-39) Mathematics and" +
                                    "\n\n2 (30-39) Accounting," +
                                    "\n\n2 (30-39) Business Studies\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D," +
                                    "\n\nEnglish HG- E or SG-D With passes in the following subjects:" +
                                    "\n\nAccounting E-HG or D-SG," +
                                    "\n\nMathematics E-HG or DSG," +
                                    "\n\nBusiness Studies E-HG or D-SG," +
                                    "\n\nEconomics E-HG or D-S \n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nMeet statutory requirements 50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects\n"
                    );
                    break;
                case "Higher Certificate: Versatile Broadcasting":
                    this.getSupportActionBar().setTitle("Versatile Broadcasting");
                    courseDescription.setText(
                            "\n\nQualification Name: Higher Certificate in Versatile Broadcasting" +
                                    "\n\nQualification Code: WS7042" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 1 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n4 (50-59) English Home or," +
                                    "\n\n4 (50-59) Additional language," +
                                    "\n\n3 (40-49) or better in 3 NSC 20 credit subjects\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG D or" +
                                    "\n\nC in 2nd Language," +
                                    "\n\n50% pass in 3 other subjects.\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL (50% or more for Mathematics or 70% or more for Mathematics Literacy)" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects\n"
                    );
                    break;
                case "Diploma: Journalism":
                    this.getSupportActionBar().setTitle("Journalism");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Journalism" +
                                    "\n\nQualification Code: WS7043" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n4 (50-59) in any other 4 subjects. " +
                                    "\n\nIn the 4 subjects, 2 must be languages (English, Afrikaans, Xhosa)\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG D or" +
                                    "\n\nC in 2nd Language\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nMeet statutory requirements 50% pass in three (3) fundamental subjects including LOTL (50% or more for Mathematics or 70% or more for Mathematics Literacy)" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects\n"
                    );
                    break;
                case "Diploma: Internal Auditing (ECP)":
                    this.getSupportActionBar().setTitle("Internal Auditing");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Internal Auditing (ECP)" +
                                    "\n\nQualification Code: WS7058, WS6019, WS5052" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of:" +
                                    "\n\n3 (40-49) English (Home or Additional Language)" +
                                    "\n\n3 (40-49) Accounting OR" +
                                    "\n\n3 (40-49) Mathematics OR" +
                                    "\n\n5 (60-69) Mathematical Literacy" +
                                    "\n\nPoints: 21\n"
                    );
                    oldCertificate.setText(
                            "\n\nPass with HG-E or" +
                                    "\n\nSG-D in English and" +
                                    "\n\nSG-D Accounting OR" +
                                    "\n\nSG-D Mathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics or 70% Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nApplied Accounting, Economic Environment and Financial Management.\n"
                    );
                    break;
                case "Diploma: Internal Auditing (Main)":
                    this.getSupportActionBar().setTitle("Internal Auditing");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Internal Auditing (Main)" +
                                    "\n\nQualification Code: WS7013, WS6014, WS5000" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown, Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of:" +
                                    "\n\n3 (40-49) English (Home or Additional Language)" +
                                    "\n\n3 (40-49) Accounting OR" +
                                    "\n\n3 (40-49) Mathematics OR" +
                                    "\n\n5 (60-69) Mathematical Literacy" +
                                    "\n\nPoints: 25\n"
                    );
                    oldCertificate.setText(
                            "\n\nPass with HG-E or" +
                                    "\n\nSG-D in English and" +
                                    "\n\nSG-D Accounting OR" +
                                    "\n\nSG-D Mathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics or 70% Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nApplied Accounting, Economic Environment and Financial Management.\n"
                    );
                    break;
                case "Diploma: Accountancy":
                    this.getSupportActionBar().setTitle("Accountancy");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Accountancy" +
                                    "\n\nQualification Code: WS6016" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAn achievement rating of:" +
                                    "\n\n3 (40-49) English," +
                                    "\n\n3 (40-49) Mathematics," +
                                    "\n\n3 (40-49) Accounting," +
                                    "\n\n3 (40-49) Economics or" +
                                    "\n\n3 (40-49) Business Studies" +
                                    "\n\n3 (40-49) Computer Application Technology," +
                                    "\n\n3 (40-49) Physical Science," +
                                    "\n\n3 (40-49) Life Sciences" +
                                    "\n\nAlternatively, a Higher or Advanced Certificate in the cognate field." +
                                    "\n\nPoints: 25\n"
                    );
                    oldCertificate.setText(
                            "\n\nN/A\n"
                    );
                    addRequirements.setText(
                            "\n\nNational Certificate (Vocational) – NC (V): National Certificate Vocational Level 4" +
                                    "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics)" +
                                    "\n\npass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nApplied Accounting, Economic Environment and Financial Management.\n"
                    );
                    break;
                case "Diploma: Financial Information Systems":
                    this.getSupportActionBar().setTitle("Financial Information Systems");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Financial Information Systems" +
                                    "\n\nQualification Code: WS7016, WS6017, WS4102" +
                                    "\n\nCampus: Buffalo City, Butterworth, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of:" +
                                    "\n\n3 (40-49) English (Home or Additional Language)" +
                                    "\n\n3 (45-49) Accounting OR" +
                                    "\n\n3 (45-49) Mathematics OR" +
                                    "\n\n5 (60-69) Mathematical Literacy." +
                                    "Points: 25\n"
                    );
                    oldCertificate.setText(
                            "\n\nPass with HG-E or SG-D in English and" +
                                    "\n\nHG-E or SG-D Accounting  OR" +
                                    "\n\nHG-E or SG-D Mathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics or 70% Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nApplied Accounting, Economic Environment and Financial Management.\n"
                    );
                    break;
                case "Diploma: Hospitality Management":
                    this.getSupportActionBar().setTitle("Hospitality Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Hospitality Management" +
                                    "\n\nQualification Code: WS7053, WS6041, WS5046" +
                                    "\n\nCampus: Buffalo City, Butterworth, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree or Diploma)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n4 (50-59) English Home or Additional language" +
                                    "\n\n3 (40-49) Life Orientation" +
                                    "\n\n3 (40-49) Mathematics" +
                                    "\n\n3 (40-49) Mathematics Literacy" +
                                    "\n\nThree (3) other recommended 2 credits subjects which include:" +
                                    "\n\nAccountancy" +
                                    "\n\nHotel Keeping & Catering" +
                                    "\n\nHospitality Management" +
                                    "\n\nHome Economics" +
                                    "\n\nEconomics" +
                                    "\n\n4 (50-59) in all other 20 credit subjects" +
                                    "\n\nPoints: 25\n"
                    );
                    oldCertificate.setText(
                            "\n\nEnglish HG-E or SG-D" +
                                    "\n\nWith passes in the following subjects:" +
                                    "\n\nMathematics" +
                                    "\n\nBusiness Economics" +
                                    "\n\nAccounting" +
                                    "\n\nHotel Keeping and Catering\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects:" +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n70% or more for Mathematics Literacy\n"
                    );
                    break;
                case "Diploma: Sport Management":
                    this.getSupportActionBar().setTitle("Sport Management");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Sport Management" +
                                    "\n\nQualification Code: WS7050" +
                                    "\n\nCampus: Buffalo City" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nWith endorsement of D or B, Matric, Level 4 NCV, N3" +
                                    "\n\n3 (40-49%) Language of Teaching (English) and Any other three of the following subjects:" +
                                    "\n\n3 (40-49%) English" +
                                    "\n\n3 (40-49%) Afrikaans" +
                                    "\n\n3 (40-49%) Xhosa" +
                                    "\n\n3 (40-49%) History" +
                                    "\n\n3 (40-49%) Geography" +
                                    "\n\n3 (40-49%) Mathematics Literacy OR" +
                                    "\n\n3 (40-49%) Mathematics (2 is required) Tourism" +
                                    "\n\n3 (40-49%) Agriculture" +
                                    "\n\n3 (40-49%) Physical Sciences" +
                                    "\n\n3 (40-49%) Life Sciences" +
                                    "\n\n3 (40-49%) Economic" +
                                    "\n\n3 (40-49%) Accounting" +
                                    "\n\n3 (40-49%) Business Economics" +
                                    "\n\nEvidence of sport involvement is compulsory and will score as follows (can count towards subjects above):" +
                                    "\n\nClub/school level: 3" +
                                    "\n\nProvincial level: 4" +
                                    "\n\nNational level: 5" +
                                    "\n\nPoints: 22\n"
                    );
                    oldCertificate.setText(
                            "\n\nWith a D symbol in the Language of Teaching (English) Any other three of the following subjects:" +
                                    "\n\nEnglish" +
                                    "\n\nAfrikaans" +
                                    "\n\nXhosa" +
                                    "\n\nHistory" +
                                    "\n\nGeography" +
                                    "\n\nMathematics Literacy OR" +
                                    "\n\nMathematics" +
                                    "\n\nTourism" +
                                    "\n\nAgriculture" +
                                    "\n\nPhysics" +
                                    "\n\nLife Sciences" +
                                    "\n\nEconomics" +
                                    "\n\nAccounting" +
                                    "\n\nBusiness Economics" +
                                    "\n\nAll of these must be passed with a minimum of E symbol Senior Certificate"+
                                    "\n\nIf minimum is not met, Maturity exemption will apply if above (23 years) Evidence of sport involvement is compulsory and will score as follows (can count towards subjects above):" +
                                    "\n\nClub/school level: 3" +
                                    "\n\nProvincial level: 4" +
                                    "\n\nNational level: 5" +
                                    "\n\nPoints: 22\n"
                    );
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Bachelor: Commerce (General)":
                    this.getSupportActionBar().setTitle("Commerce");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Commerce (General)" +
                                    "\n\nQualification Code: WS5020, WS4113" +
                                    "\n\nCampus: Mthatha, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\nMathematics 3 (50-59%) or better (No Maths Literacy)" +
                                    "\n\nEnglish 3 (40-49%) or better" +
                                    "\n\nPoints: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nMatriculation Exemption" +
                                    "\n\nMathematics pass: HG-E or SG-D\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements" +
                                    "\n\n60% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or better for Mathematics\n"
                    );
                    break;
                case "Bachelor: Commerce (Economics)":
                    this.getSupportActionBar().setTitle("Commerce");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Commerce (Economics)" +
                                    "\n\nQualification Code: WS5027" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\nMathematics 3 (50-59%) or better (No Maths Literacy)" +
                                    "\n\nEnglish 3 (40-49%) or better" +
                                    "\n\nPoints: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nMatriculation Exemption" +
                                    "\n\nMathematics pass: HG-E or SG-D\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements" +
                                    "\n\n60% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or better for Mathematics\n"
                    );
                    break;
                case "Bachelor: Commerce (Business Management)":
                    this.getSupportActionBar().setTitle("Commerce");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Commerce (Business Management)" +
                                    "\n\nQualification Code: WS5028" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\nMathematics 3 (50-59%) or better (No Maths Literacy)" +
                                    "\n\nEnglish 3 (40-49%) or better" +
                                    "\n\nPoints: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nMatriculation Exemption" +
                                    "\n\nMathematics pass: HG-E or SG-D\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements" +
                                    "\n\n60% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or better for Mathematics\n"
                    );
                    break;
                case "Bachelor: Accounting Science":
                    this.getSupportActionBar().setTitle("Accounting Science");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Accounting Science" +
                                    "\n\nQualification Code: WS5002" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nLife Orientation Skills limited to 3" +
                                    "\n\nMinimum point score of 5 for English and" +
                                    "\n\n4 for Mathematics (Not Mathematics Literacy)" +
                                    "\n\nCompulsory NSC subjects:" +
                                    "\n\nEnglish and Mathematics (Not Mathematics Literacy)" +
                                    "\n\nPoints: 30\n"
                    );
                    oldCertificate.setText(
                            "\n\nGrade 12 pass with a University Endorsement Admission point score of 32." +
                                    "\n\n(HG points: A=8, B=7, C=6, D=5, E=4, F=3)" +
                                    "\n\n(SG points: A=7, B=6, C=5, D=4, E=3, F=2)" +
                                    "\n\nMinimum point score of 6 for Mathematics at both HG and SG" +
                                    "\n\nCompulsory grade 12 subjects:" +
                                    "\n\nEnglish and Mathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Bachelor: Accounting":
                    this.getSupportActionBar().setTitle("Accounting");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Accounting" +
                                    "\n\nQualification Code: WS5001" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAdmission Point Score (APS) of 28" +
                                    "\n\nExcluding Life Orientation Skills limited to 3" +
                                    "\n\nMinimum point score of 4 for both English and Mathematics (Not Mathematics Literacy)" +
                                    "\n\nCompulsory NSC subjects:" +
                                    "\n\nEnglish and Mathematics (Not Mathematics Literacy)\n"
                    );
                    oldCertificate.setText(
                            "\n\nGrade 12 pass with a University Endorsement Admission point score of 32." +
                                    "\n\n(HG points: A=8, B=7, C=6, D=5, E=4, F=3)" +
                                    "\n\n(SG points: A=7, B=6, C=5, D=4, E=3, F=2)" +
                                    "\n\nMinimum point score of 6 for Mathematics at both HG and SG" +
                                    "\n\nCompulsory grade 12 subjects:" +
                                    "\n\nEnglish and Mathematics"
                    );
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Bachelor: Administration":
                    this.getSupportActionBar().setTitle("Administration");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Administration" +
                                    "\n\nQualification Code: WS5040" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n4 (50-59%) in English or better" +
                                    "\n\n4 (50-59%) in three (3) recognised subjects or better" +
                                    "\n\nCompulsory grade 12 subject:" +
                                    "\n\nEnglish, Mathematics or Mathematical Literacy is not compulsory\n"
                    );
                    oldCertificate.setText(
                            "\n\nMatriculation Exemption" +
                                    "\n\nEnglish pass: HG-E or SG-D" +
                                    "\n\nMathematics or Mathematical Literacy is not compulsory\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\n50% pass in three (3) fundamental subjects including LOTL" +
                                    "\n\n60% pass in three (3) compulsory vocational subjects" +
                                    "\n\n50% or more for Mathematics or" +
                                    "\n\n70% or more for Mathematics Literacy\n"
                    );
                    break;
                case "Bachelor: Education (Foundation Phase Teaching)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Foundation Phase Teaching)" +
                                    "\n\nQualification Code: WS6139, WS5587" +
                                    "\n\nCampus: Butterworth, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n2 (30-39) Mathematics or" +
                                    "\n\n4 (50-59) Mathematical Literacy" +
                                    "\n\n4 (40-49) English and" +
                                    "\n\n4 (40-49) isiXhosa any four (4) NSC subjects" +
                                    "\n\n5 (60-69) Life Orientation" +
                                    "\n\nAnd any other two subjects at level 3 (40-49)" +
                                    "\n\nProficiency in language of learning and teaching namely isiXhosa and English is a requirement." +
                                    "Points: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nWith Matriculation Exemption." +
                                    "\n\nAt least two (2) subjects HG-E and SG-D, From isiXhosa HL, English FAL of HL, Mathematics and a pass in any other two (2) school subjects" +
                                    "\n\nMature Age exemption for applicants in possession of the Senior Certificate as per Rule 1.13 of the 2020" +
                                    "\n\nWSU General Prospectus -Rules and Regulations.\n"
                    );
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Economics & Management Sciences)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Economics & Management Sciences)" +
                                    "\n\nQualification Code: WS6140" +
                                    "\n\nCampus: Butterworth, Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n4 (50-59) English" +
                                    "\n\n4 (50-59) in any two subjects from the following:" +
                                    "\n\nAccounting," +
                                    "\n\nBusiness Studies," +
                                    "\n\nEconomics," +
                                    "\n\nComputer Applications Technology," +
                                    "\n\nInformation Technology," +
                                    "\n\nMathematics\n"
                    );
                    oldCertificate.setText(
                            "\n\nWith Matriculation Exemption or mature age exemption with at least 40% or E symbol on HG or" +
                                    "\n\n50% or D symbol on SG in English and" +
                                    "\n\n40% or E (HG) or 50% or D on SG in ANY TWO of the following subjects:" +
                                    "\n\nAccounting," +
                                    "\n\nBusiness Studies," +
                                    "\n\nComputer Typing or" +
                                    "\n\nComputer Practice," +
                                    "\n\nEconomics," +
                                    "\n\nMathematics\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nA National Certificate Vocational (NCV) Level 4/N3 Certificate with Bachelor’s degree endorsement with at least 50% in English and" +
                                    "\n\n60% in any two of the following subjects:" +
                                    "\n\nApplied Accounting or" +
                                    "\n\nFinancial Accounting," +
                                    "\n\nBusiness Practice," +
                                    "\n\nEconomic Environment," +
                                    "\n\nLife Orientation," +
                                    "\n\nMathematics," +
                                    "\n\nOffice Data Processing." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate/National N Diploma with 50% achievement in the \respective subjects that are equivalent to:" +
                                    "\n\nEnglish," +
                                    "\n\nEntrepreneurship & Business Management," +
                                    "\n\nFinancial Accounting," +
                                    "\n\nComputer Practice or" +
                                    "\n\nInformation Processing," +
                                    "\n\nEconomics," +
                                    "\n\nMathematics" +
                                    "\n\n**NB Applicants with N4/N5/N6/N Diploma will be admitted after being subjected to RPL assessment as guided by the university policies and rules\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Technology Mathematics)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Technology Mathematics)" +
                                    "\n\nQualification Code: WS6141" +
                                    "\n\nCampus: Butterworth" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nEndorsement: NSC (Bachelor’s Degree)" +
                                    "\n\nAchievement rating of at least:" +
                                    "\n\n4 (50-59) in English and" +
                                    "\n\n3 (40-49) in any TWO of the following subjects" +
                                    "\n\nTechnical Mathematics" +
                                    "\n\nMathematics" +
                                    "\n\nTechnical Sciences" +
                                    "\n\nPhysical Sciences" +
                                    "\n\nEngineering Graphics and Design" +
                                    "\n\nCivil Technology (Civil Service)" +
                                    "\n\nCivil Technology (Construction)" +
                                    "\n\nCivil Technology (Woodworking)" +
                                    "\n\nElectrical Technology (Digital)" +
                                    "\n\nElectrical Technology (Electronics)" +
                                    "\n\nElectrical Technology (Power Systems)" +
                                    "\n\nMechanical Technology (Automotive)" +
                                    "\n\nMechanical Technology (Fitting & Machining)" +
                                    "\n\nMechanical Technology (Welding & Metalwork)" +
                                    "\n\nNB :- Applicants with two or more of the approved Technical subjects:" +
                                    "\n\nCivil Technology," +
                                    "\n\nElectrical Technology," +
                                    "\n\nMechanical Technology," +
                                    "\n\nEngineering Graphics and Design," +
                                    "\n\nTechnical Mathematics and" +
                                    "\n\nTechnical Sciences will receive first preference.\n"
                    );
                    oldCertificate.setText(
                            "\n\nWith Matriculation Exemption or mature age exemption with at least 40% or E symbol on HG or 50% or D symbol on SG in English and 40% or E (HG) or 50% or D on SG in ANY TWO of the following approved subjects:" +
                                    "\n\nMechanical Technology," +
                                    "\n\nCivil Technology," +
                                    "\n\nElectrical Technology and Technical Drawing or" +
                                    "\n\nMathematics and Physical Science," +
                                    "\n\nand a pass in any other one or two school subjects\n"
                    );
                    addRequirements.setText(
                            "\n\nMeet statutory requirements:" +
                                    "\n\nA  National Certificate Vocational (NCV) Level 4 with Bachelor’s degree endorsement with at least 60% in English, any four vocational subjects" +
                                    "\n\nfrom Civil Engineering & Building Construction or" +
                                    "\n\nElectrical Infrastructure Construction or" +
                                    "\n\nEngineering & Related Design or Drawing Office Practice\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Mathematics, Science & Technology)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Mathematics, Science & Technology)" +
                            "\n\nQualification Code: WS5581" +
                                    "\n\nCampus: Qeenstown, Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with Bachelor’s degree endorsement with an achievement rating of at least level:" +
                                    "\n\n4 (50-59%) Life Sciences," +
                                    "\n\n4 (50-59%) Mathematics," +
                                    "\n\n4 (50-59%) Physical Sciences," +
                                    "\n\n4 (50-59%) Agricultural Sciences." +
                                    "\n\nEnglish and any other subject with an achievement rating of at least level 3 (40–49%)." +
                                    "Points: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with Matriculation Exemption or mature exemption with at least:" +
                                    "\n\nE (HG) or D (SG) in English, Life Sciences, Mathematics, Physical Sciences, Agricultural Sciences.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate Vocational (NCV) Level 4 with Bachelor’s degree endorsement with at least:" +
                                    "\n\n60% in Life Sciences, Mathematics, Physical Sciences, Agricultural Sciences." +
                                    "\n\nThe subjects that will be not be taken as majors including English can have at least 50%." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate with at least:" +
                                    "\n\n50% achievement in the respective subjects that are equivalent to English, Life Sciences, Mathematics, Physical Sciences, Agricultural Sciences.\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Humanities, Languages, Arts and Culture)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Humanities, Languages, Arts and Culture)" +
                                    "\n\nCampus: Qeenstown" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with Bachelor’s degree endorsement with an achievement rating of at least level:" +
                                    "\n\n4 (50-59) English" +
                                    "\n\n4 (50-59) isiXhosa" +
                                    "\n\n4 (50-59) History" +
                                    "\n\n4 (50-59) Geography" +
                                    "\n\nwith at least 60% in Life Orientation.\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with Matriculation Exemption or mature exemption with at least:" +
                                    "\n\nE (HG) or D (SG) in any of the two subjects namely: English, isiXhosa, History, Geography.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate Vocational (NCV) Level 4 with Bachelor’s degree endorsement with at least:" +
                                    "\n\n60% in English, isiXhosa, History, Geography, Life Orientation." +
                                    "\n\nThe subjects that will be not be taken as majors including English can have at least 50%." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate with at least:" +
                                    "\n\n50% achievement in the respective subjects that are equivalent to English, isiXhosa, History, Geography, Life Orientation\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Languages)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Languages)" +
                            "\n\nQualification Code: WS5585" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with Bachelor’s degree endorsement with at least:" +
                                    "\n\n50% in English and isiXhosa." +
                                    "\n\nAt least 50% in Life Orientation." +
                                    "\n\nA minimum rating of 4 (50 – 59%) for English which is the language of learning and teaching at WSU." +
                                    "\n\nA pass in the remaining school subjects." +
                                    "Points: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with matriculation exemption or mature age exemption with at least:" +
                                    "\n\nAn E symbol on HG or a D symbol on SG in the subjects namely:" +
                                    "\n\nEnglish, isiXhosa and Life Orientation." +
                                    "\n\nAt least Higher Grade (HG) E symbol or Standard Grade (SG) D symbol in English which is the language of learning and teaching at WSU.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate (Vocational) NQF Level 4 with Bachelor’s degree endorsement with at least:" +
                                    "\n\n60% English, isiXhosa, and Life Orientation." +
                                    "\n\nThe subjects that will be not be taken as majors including English can have at least 50%." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate with at least 50% achievement in the respective subjects that are equivalent to English, isiXhosa and Life Orientation." +
                                    "\n\nA minimum rating of 50% for English which is the language of learning and teaching at WSU.\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Humanities)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Humanities, Languages, Arts and Culture)" +
                                    "\n\nQualification Code: WS5563" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with Bachelor’s degree endorsement with at least:" +
                                    "\n\n50% in History, Geography and Life Orientation." +
                                    "\n\nA minimum rating of 4 (50–59%) for English which is the language of learning and teaching at WSU." +
                                    "\n\nA pass in the remaining school subjects.\n" +
                                    "Points: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with matriculation exemption or mature age exemption with at least:" +
                                    "\n\nAn E symbol on HG or D symbol on SG in the subjects namely:" +
                                    "\n\nHistory, Geography and Life Orientation." +
                                    "\n\nAt least Higher Grade (HG) E symbol or Standard Grade (SG) D symbol in English which is the language of learning and teaching at WSU.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate (Vocational) NQF Level 4 with Bachelor’s degree endorsement with at least:" +
                                    "\n\n60% in Geography, History and Life Orientation." +
                                    "\n\nThe subjects that will be not be taken as majors including English can have at least 50%." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate with at least 50% achievement in the respective subjects that are equivalent to History and Geography." +
                                    "\n\nA minimum rating of 50% for English which is the language of learning and teaching at WSU.\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Arts and Culture)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Arts and Culture)" +
                                    "\n\nQualification Code: WS5560" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with Bachelor’s degree endorsement with at least:" +
                                    "\n\n50% in History and Music or Dramatic Arts or Dance Studies or Visual Arts." +
                                    "\n\nA minimum rating of 4 (50-59%) for English which is the language of learning and teaching at WSU." +
                                    "\n\nA pass in the remaining school subjects including Life Orientation." +
                                    "\n\nPoints: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with matriculation exemption or mature age exemption with at least:" +
                                    "\n\nAn E symbol on HG or D symbol on SG in at least two subjects namely:" +
                                    "\n\nHistory, Music, Dance Studies or Dramatic Arts or Visual Arts and Life Orientation." +
                                    "\n\nAt least Higher Grade (HG) E symbol or Standard Grade (SG) D symbol in English which is the language of learning and teaching at WSU.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate Vocational (NCV) Level 4 with Bachelor’s degree endorsement with at least:" +
                                    "\n\n60% in English, isiXhosa, History, Geography, Life Orientation." +
                                    "\n\nThe subjects that will be not be taken as majors including English can have at least 50%." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate with at least:" +
                                    "\n\n50% achievement in the respective subjects that are equivalent to English, isiXhosa, History, Geography, Life Orientation\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Consumer & Management Sciences)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Consumer & Management Sciences)" +
                                    "\n\nQualification Code: WS5580" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with bachelor’s degree endorsement rating of at least:" +
                                    "\n\n4 (50–59%) in any four subjects, least one of which should be:" +
                                    "\n\nConsumer Studies, Hospitality Studies or Tourism, and Mathematical Literacy, two of which will be taken as Majors." +
                                    "\n\nAt least a rating of 3 (40–49%) for English which is the language of learning and teaching at WSU and a pass in the remaining school subjects." +
                                    "\n\nPoints: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with matriculation exemption or mature age exemption with at least:" +
                                    "\n\nHigher Grade (HG) E symbol on or 50% or Standard Grade (SG) D symbol in English and Higher Grade (HG) E or 50% or Standard Grade (SG) D in ANY TWO of the following subjects:" +
                                    "\n\nConsumer Studies/Home Economics, Hospitality Studies/Hotel keeping and Catering, Tourism, and Needlework and Clothing and a pass in any other one or two school subjects." +
                                    "\n\nA pass in the other one or two subjects.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate Vocational (NCV) Level 4/N3 Certificate with bachelor’s degree endorsement with at least:" +
                                    "\n\n50% in fundamental subjects including English and 60% in any two of the following vocational subjects such as:" +
                                    "\n\nConsumer Studies, Hospitality Studies or Tourism, and Mathematical Literacy, two of which will be taken as Majors." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate/National N Diploma with 50% achievement in the respective subjects that are equivalent to:" +
                                    "\n\nEnglish, Consumer Studies, Hospitality Studies or Tourism, and Mathematical Literacy, two of which will be taken as Majors.\n"
                    );
                    break;
                case "Bachelor: Education (Senior Phase & FET Teaching - Business, Commerce and Management)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education (Senior Phase & FET Teaching - Business, Commerce and Management)" +
                                    "\n\nQualification Code: WS5582" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 4 Years\n");
                    newCertificate.setText(
                            "\n\nA National Senior Certificate (NSC), with bachelor’s degree endorsement with at least:" +
                                    "\n\n50% in English, and 50% in ANY TWO of the following subjects:" +
                                    "\n\nAccounting, Business Studies, Economics." +
                                    "\n\nAt least 30% in Mathematics or 50% in Mathematical Literacy." +
                                    "\n\nA pass in the remaining two or three subjects." +
                                    "\n\nPoints: 28\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate (SC) with matriculation exemption or mature age exemption with at least:" +
                                    "\n\n40% or E symbol on HG or 50% or D symbol on SG in English and 40% or E (HG) or 50% or D on SG in ANY TWO of the following subjects:" +
                                    "\n\nAccounting, Business Studies, Economics." +
                                    "\n\nA pass in the other one or two subjects.\n"
                    );
                    addRequirements.setText(
                            "\n\nA National Certificate Vocational (NCV) Level 4/N3 Certificate with bachelor’s degree endorsement with at least:" +
                                    "\n\n50% in fundamental subjects including English and 60% in any two of the following vocational subjects such as:" +
                                    "\n\nApplied Accounting or Financial Accounting, Business Practice, Economic Environment, Life Orientation, Mathematics." +
                                    "\n\nOR" +
                                    "\n\nN4 or N5 or N6 Certificate/National N Diploma with 50% achievement in the respective subjects that are equivalent to:" +
                                    "\n\nEnglish, Entrepreneurship & Business Management, Financial Accounting, Economics.\n"
                    );
                    break;
                case "Diploma: Adult Community Education and Training (ACET)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Diploma in Adult Community Education and Training (ACET)" +
                                    "\n\nQualification Code: WS5583" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nDiploma Endorsement NSC rating of at least:" +
                                    "\n\n3 (40–49) in English and IsiXhosa," +
                                    "\n\nAt least level 2 (30–39) in Mathematics or Mathematical Literacy" +
                                    "\n\nAnd a pass (level 2 or 3) in any three of the following subjects:" +
                                    "\n\nHistory, geography, Agriculture, Life Sciences, Physical Sciences, Accounting, Economics, Business Studies and Computer Applications and Technology." +
                                    "\n\nPoints: 25\n"
                    );
                    oldCertificate.setText(
                            "\n\nA Senior Certificate, at least Higher Grade E in English and IsiXhosa or Standard Grade D, at least HG F in Mathematics or SD E and a pass (at least SD/HG E in any of the matriculation subjects).\n"
                    );
                    addRequirements.setText(
                            "\n\nNational Certificate (Vocational) Level 4 issued by Council for General and Further Education and Training." +
                                    "\n\nA student must have achieved at least 40% in three Fundamental subjects including English and at least 50% in three compulsory vocational subjects." +
                                    "\n\nA pass in IsiXhosa is very important.\n"
                    );
                    break;
                case "Post Graduate Certificate: Education (Science)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Post Graduate Certificate in Education (Science)" +
                                    "\n\nQualification Code: WS5545" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: NF, ZF, ZP" +
                                    "\n\nDuration: 1 / 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nA relevant Diploma or Degree with two teaching subjects one at least at:" +
                                    "\n\nfirst year university/tertiary level for SP Teaching (NQF level 6 – Year one course with 24 credits) and" +
                                    "\n\nthe other one second year or third year course with 32 to 48 credits 3rd year level for FET Teaching – i.e. at NQF level 7 or 8).\n"
                    );
                    break;
                case "Post Graduate Certificate: Education (Languages)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Post Graduate Certificate in Education (Languages)" +
                                    "\n\nQualification Code: WS5547" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: NF, ZF, ZP" +
                                    "\n\nDuration: 1 / 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nA relevant Diploma or Degree with two teaching subjects one at least at:" +
                                    "\n\nfirst year university/tertiary level for SP Teaching (NQF level 6 – Year one course with 24 credits) and" +
                                    "\n\nthe other one second year or third year course with 32 to 48 credits 3rd year level for FET Teaching – i.e. at NQF level 7 or 8).\n"
                    );
                    break;
                case "Post Graduate Certificate: Education (Humanities)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Post Graduate Certificate in Education (Humanities)" +
                                    "\n\nQualification Code: WS5543" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: NF" +
                                    "\n\nDuration: 1 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nA relevant Diploma or Degree with two teaching subjects one at least at:" +
                                    "\n\nfirst year university/tertiary level for SP Teaching (NQF level 6 – Year one course with 24 credits) and" +
                                    "\n\nthe other one second year or third year course with 32 to 48 credits 3rd year level for FET Teaching – i.e. at NQF level 7 or 8).\n"
                    );
                    break;
                case "Bachelor: Education Honours (B. Ed Hons)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in Education Honours (B. Ed Hons)" +
                                    "\n\nQualification Code: WS5546" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Part-Time (NP)" +
                                    "\n\nDuration: 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nA degree in Education" +
                                    "\n\nAny degree & PGCE" +
                                    "\n\nDiploma in Education & PGCE OR" +
                                    "\n\nACE & Teachers Diploma\n"
                    );
                    break;
                case "Master: Education (M. Ed)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Master of Education (M. Ed)" +
                                    "\n\nQualification Code: WS5548" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Part-Time (NP)" +
                                    "\n\nDuration: 2 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nA B Ed Hons or Honours Degree (with a teaching qualification)" +
                                    "\n\nor any other qualification deemed equivalent by the WSU" +
                                    "\n\nRecognition of Prior Learning (RPL) and by Senate.\n"
                    );
                    break;
                case "Doctor: Education (D.Ed.)":
                    this.getSupportActionBar().setTitle("Education");
                    courseDescription.setText(
                            "\n\nQualification Name: Doctor of Education (D.Ed.)" +
                                    "\n\nQualification Code: WS5551" +
                                    "\n\nCampus: Mathatha" +
                                    "\n\nOffering Type: Part-Time (NP)" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nN/A\n");
                    oldCertificate.setText(
                            "\n\nN/A\n");
                    courseRequirements.setText("Requirements");
                    addRequirements.setText(
                            "\n\nMEd & B.Ed. Hons and B.Ed. degree" +
                                    "\n\nAny relevant Master’s degree & B.Ed. Hons & B.Ed. degree" +
                                    "\n\nAny relevant Master’s degree & Advanced / Further Diploma in Education & PGCE/Teacher Course .\n"
                    );
                    break;
                case "English and Accounting OR Mathematics":
                    this.getSupportActionBar().setTitle("English & Accounting OR Mathematics");
                    courseDescription.setText(
                            "\n\nQualification Name: Bachelor in English and Accounting OR Mathematics" +
                                    "\n\nCampus: Mthatha" +
                                    "\n\nOffering Type: Full Time" +
                                    "\n\nDuration: 3 Years\n");
                    newCertificate.setText(
                            "\n\nAchievement rating of:" +
                                    "\n\n3 (40-49) English (Home or Additional Language)" +
                                    "\n\n3 (40-49) Accounting OR" +
                                    "\n\n3 (40-49) Mathematics OR" +
                                    "\n\n5 (60-69) Mathematical Literacy.\n"
                    );
                    oldCertificate.setText(
                            "\n\nPass all 3 Fundamental subjects with 50% and above (English, Life Orientation and Mathematics or 70% Mathematical Literacy)." +
                                    "\n\nPass with 60% and above in 3 of the Vocational subjects:" +
                                    "\n\nApplied Accounting, Economic Environment and Financial Management.\n"
                    );
                    addRequirements.setText(
                            "\n\nN/A\n"
                    );
                    break;
            }
        // showing the back button in action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}