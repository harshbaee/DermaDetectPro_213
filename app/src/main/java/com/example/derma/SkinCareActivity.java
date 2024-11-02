package com.example.derma;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SkinCareActivity extends AppCompatActivity {

    private Spinner skinCareSpinner;
    private TextView solutionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_care);

        skinCareSpinner = findViewById(R.id.spinnerSkinCare);
        solutionTextView = findViewById(R.id.solutionTextView); // Get reference to TextView
        Button showSolutionButton = findViewById(R.id.showSolutionButton);

        // Set up Spinner with options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.skin_care_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skinCareSpinner.setAdapter(adapter);

        showSolutionButton.setOnClickListener(v -> showSolution());
    }

    private void showSolution() {
        int selectedPosition = skinCareSpinner.getSelectedItemPosition();
        String solution = getSolutionForSelectedOption(selectedPosition);

        // Update the solution in the TextView instead of showing a Toast
        solutionTextView.setText(solution);
    }

    private String getSolutionForSelectedOption(int selectedPosition) {
        switch (selectedPosition) {
            case 0: return "Morning:\n" +
                    "\n" +
                    "1. Cleanser: Use a gentle, hydrating cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Apply an alcohol-free toner to balance pH.\n" +
                    "\n" +
                    "\n" +
                    "3. Moisturizer: Use a lightweight, non-greasy moisturizer.\n" +
                    "\n" +
                    "\n" +
                    "4. Sunscreen: SPF 30 or higher for sun protection.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Evening:\n" +
                    "\n" +
                    "1. Cleanser: Use the same gentle cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Reapply the toner.\n" +
                    "\n" +
                    "\n" +
                    "3. Moisturizer: Use a slightly heavier moisturizer for hydration.\n" +
                    "\n" +
                    "\n" +
                    "4. Eye cream: To prevent wrinkles and puffiness.";
            case 1: return "Morning:\n" +
                    "\n" +
                    "1. Cleanser: Use a cream-based or hydrating cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Use a hydrating toner with no alcohol.\n" +
                    "\n" +
                    "\n" +
                    "3. Serum: Apply a hyaluronic acid or glycerin-based serum for hydration.\n" +
                    "\n" +
                    "\n" +
                    "4. Moisturizer: Use a rich, nourishing moisturizer.\n" +
                    "\n" +
                    "\n" +
                    "5. Sunscreen: Apply SPF 30 or higher.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Evening:\n" +
                    "\n" +
                    "1. Cleanser: Use the same hydrating cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Use the hydrating toner.\n" +
                    "\n" +
                    "\n" +
                    "3. Serum: Apply a repair serum like Vitamin E or hyaluronic acid.\n" +
                    "\n" +
                    "\n" +
                    "4. Moisturizer: Use a thicker night cream or balm.\n" +
                    "\n" +
                    "\n" +
                    "5. Facial oil (optional): Seal in moisture with a few drops of facial oil.\n" +
                    "\n" +
                    "\n";
            case 2: return "Morning:\n" +
                    "\n" +
                    "1. Cleanser: Use a gentle foaming or salicylic acid cleanser to control oil.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Use an alcohol-free toner that controls sebum production.\n" +
                    "\n" +
                    "\n" +
                    "3. Serum: A lightweight serum with niacinamide for oil control.\n" +
                    "\n" +
                    "\n" +
                    "4. Moisturizer: Use a lightweight, oil-free moisturizer.\n" +
                    "\n" +
                    "\n" +
                    "5. Sunscreen: Use a mattifying SPF 30 or higher.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Evening:\n" +
                    "\n" +
                    "1. Cleanser: Use the same oil-control cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Reapply the toner to minimize pores.\n" +
                    "\n" +
                    "\n" +
                    "3. Serum: Use a retinol or salicylic acid serum to reduce acne.\n" +
                    "\n" +
                    "\n" +
                    "4. Moisturizer: Use an oil-free gel moisturizer.";
            case 3 : return "Morning:\n" +
                    "\n" +
                    "1. Cleanser: Use a gentle salicylic acid or benzoyl peroxide cleanser to treat and prevent acne.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Apply an alcohol-free toner with tea tree oil or witch hazel to help control oil and soothe skin.\n" +
                    "\n" +
                    "\n" +
                    "3. Acne Treatment: Apply a spot treatment containing benzoyl peroxide, salicylic acid, or sulfur to active acne spots.\n" +
                    "\n" +
                    "\n" +
                    "4. Serum: Use a serum with niacinamide (anti-inflammatory and helps with oil control) or zinc to reduce redness and sebum production.\n" +
                    "\n" +
                    "\n" +
                    "5. Moisturizer: Use a lightweight, oil-free moisturizer. Look for one with ingredients like aloe vera or ceramides to maintain hydration without clogging pores.\n" +
                    "\n" +
                    "\n" +
                    "6. Sunscreen: Use a broad-spectrum SPF 30 or higher. Opt for a non-comedogenic (non-pore-clogging) sunscreen that is mattifying.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Evening:\n" +
                    "\n" +
                    "1. Cleanser: Use the same acne-fighting cleanser to remove dirt, oil, and makeup.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Reapply the toner to balance the skin and help with oil control.\n" +
                    "\n" +
                    "\n" +
                    "3. Treatment: Apply retinol or adapalene (Differin) to speed up cell turnover and prevent clogged pores, as well as to fade dark spots.\n" +
                    "\n" +
                    "\n" +
                    "4. Acne Spot Treatment: Use the same spot treatment on active breakouts if needed.\n" +
                    "\n" +
                    "\n" +
                    "5. Moisturizer: Use an oil-free, non-comedogenic moisturizer to hydrate skin without causing further breakouts.";
            case 4 : return "Morning:\n" +
                    "\n" +
                    "1. Cleanser: Use a gentle, non-exfoliating cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Exfoliation (2-3 times a week): Use a mild exfoliator with glycolic acid or lactic acid to help brighten dark spots. Do not over-exfoliate.\n" +
                    "\n" +
                    "\n" +
                    "3. Toner: Apply a brightening toner with ingredients like vitamin C or licorice extract to lighten pigmentation.\n" +
                    "\n" +
                    "\n" +
                    "4. Serum: Use a serum with vitamin C or niacinamide to brighten the skin and fade dark spots. Vitamin C also protects the skin from environmental stressors.\n" +
                    "\n" +
                    "\n" +
                    "5. Moisturizer: Use a hydrating moisturizer with ingredients like hyaluronic acid to keep skin plump and hydrated.\n" +
                    "\n" +
                    "\n" +
                    "6. Sunscreen: Sunscreen is crucial! Use a broad-spectrum SPF 30+ sunscreen to prevent further dark spots from forming and existing ones from worsening.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Evening:\n" +
                    "\n" +
                    "1. Cleanser: Use a mild, hydrating cleanser.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Apply a brightening toner with antioxidants or licorice extract to target dark spots.\n" +
                    "\n" +
                    "\n" +
                    "3. Treatment: Apply a retinoid (retinol or tretinoin) or AHA serum to speed up cell turnover and help fade dark spots over time.\n" +
                    "\n" +
                    "\n" +
                    "4. Moisturizer: Use a deeply hydrating moisturizer, preferably one with peptides or ceramides to repair the skin’s barrier.";
            case 5 : return"1. Cleanser: Use a gentle, brightening cleanser with ingredients like Vitamin C, licorice extract, or aloe vera to help fade tan and soothe the skin.\n" +
                    "\n" +
                    "\n" +
                    "2. Exfoliation (2-3 times per week): Use a gentle exfoliator containing glycolic acid, lactic acid, or papaya enzymes to slough off dead skin cells and reveal fresher, untanned skin.\n" +
                    "\n" +
                    "\n" +
                    "3. Toner: Apply a brightening toner with ingredients like licorice root, niacinamide, or cucumber to help lighten sun damage and even out skin tone.\n" +
                    "\n" +
                    "\n" +
                    "4. Serum: Use a Vitamin C serum to fight free radicals, reduce pigmentation, and brighten skin tone. Vitamin C is effective in reversing sun damage and fading tan.\n" +
                    "\n" +
                    "\n" +
                    "5. Moisturizer: Apply a hydrating moisturizer with antioxidants like niacinamide or green tea, which helps repair the skin barrier and reduce the appearance of tanning.\n" +
                    "\n" +
                    "\n" +
                    "6. Sunscreen: Use a broad-spectrum SPF 30 or higher every day, regardless of whether you're indoors or outdoors. Sunscreen is crucial to prevent further tanning and sun damage. Opt for a sunscreen with physical blockers like zinc oxide for extra protection.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Evening:\n" +
                    "\n" +
                    "1. Cleanser: Use the same brightening cleanser to remove impurities and any remaining sunscreen.\n" +
                    "\n" +
                    "\n" +
                    "2. Toner: Reapply the brightening toner to balance skin and prep it for treatment.\n" +
                    "\n" +
                    "\n" +
                    "3. Treatment: Apply a retinoid (retinol or tretinoin) or an AHA serum to boost cell turnover and help fade tan. These treatments accelerate the skin's natural exfoliation process, gradually reducing sun damage.\n" +
                    "\n" +
                    "\n" +
                    "4. Moisturizer: Use a nourishing, hydrating moisturizer to repair and soothe the skin overnight. Look for ingredients like ceramides or hyaluronic acid for deep hydration.\n" +
                    "\n" +
                    "\n" +
                    "5. Brightening Mask (1-2 times per week): Use a mask with turmeric, licorice extract, or vitamin C to help lighten tan and promote a glowing complexion.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Additional Tips for Tanning:\n" +
                    "\n" +
                    "After-Sun Care: Apply soothing products like aloe vera gel or green tea extracts after sun exposure to calm any inflammation and reduce the appearance of tanning.\n" +
                    "\n" +
                    "Hydration: Drink plenty of water and consume foods rich in antioxidants (like berries and green tea) to support your skin’s repair process from within.\n" +
                    "\n" +
                    "Avoid Harsh Sun: Wear protective clothing, hats, and sunglasses when outside to limit further tanning.";
            default: return "Please select a skin care issue.";
        }
    }
}
