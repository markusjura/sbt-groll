import scalariform.formatter.preferences.AlignSingleLineCaseStatements

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value.setPreference(AlignSingleLineCaseStatements, true)
