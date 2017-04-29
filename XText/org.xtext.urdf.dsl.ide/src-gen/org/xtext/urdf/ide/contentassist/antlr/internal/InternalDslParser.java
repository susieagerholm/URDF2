package org.xtext.urdf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'", "'Robot'", "'Link'", "'Collision'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'Limit'", "'Axis'", "'Origin'", "'Calibration'", "'Dynamics'", "'Mimic'", "'SafetyController'", "'Inertial'", "'Inertia'", "'Mass'", "'Visual'", "'Geometry'", "'Material'", "'xyz'", "'roll_pitch_yaw'", "'massValueInKilograms'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Color'", "'red_green_blue_alpha'", "'red'", "'green'", "'blue'", "'alpha'", "'Texture'", "'pathToFile'", "'Box'", "'height_length_width'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'scale'", "'Sphere'", "'effort'", "'velocity'", "'lower'", "'upper'", "'x'", "'y'", "'z'", "'rising'", "'falling'", "'friction'", "'damping'", "'mimics'", "'multiplier'", "'offSet'", "'k_velocity'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRobot EOF )
            // InternalDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:78:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleMaterial EOF )
            // InternalDsl.g:80:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:87:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Material__Alternatives )
            // InternalDsl.g:94:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:103:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleGeometry EOF )
            // InternalDsl.g:105:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:112:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Geometry__Alternatives )
            // InternalDsl.g:119:4: rule__Geometry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:128:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleLink EOF )
            // InternalDsl.g:130:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:137:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Link__Group__0 )
            // InternalDsl.g:144:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:153:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleJoint EOF )
            // InternalDsl.g:155:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:162:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Joint__Group__0 )
            // InternalDsl.g:169:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:178:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleInertial EOF )
            // InternalDsl.g:180:1: ruleInertial EOF
            {
             before(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getInertialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:187:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Inertial__Group__0 )
            // InternalDsl.g:194:4: rule__Inertial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:203:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleVisual EOF )
            // InternalDsl.g:205:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:212:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Visual__Group__0 )
            // InternalDsl.g:219:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:228:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleCollision EOF )
            // InternalDsl.g:230:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:237:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Collision__Group__0 )
            // InternalDsl.g:244:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:253:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleOrigin EOF )
            // InternalDsl.g:255:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:262:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Origin__Group__0 )
            // InternalDsl.g:269:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:278:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleMass EOF )
            // InternalDsl.g:280:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:287:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Mass__Group__0 )
            // InternalDsl.g:294:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:303:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleInertia EOF )
            // InternalDsl.g:305:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:312:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Inertia__Group__0 )
            // InternalDsl.g:319:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:328:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleColor EOF )
            // InternalDsl.g:330:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:337:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Color__Alternatives ) ) )
            // InternalDsl.g:342:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Color__Alternatives ) )
            // InternalDsl.g:343:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalDsl.g:344:3: ( rule__Color__Alternatives )
            // InternalDsl.g:344:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:353:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTexture EOF )
            // InternalDsl.g:355:1: ruleTexture EOF
            {
             before(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            ruleTexture();

            state._fsp--;

             after(grammarAccess.getTextureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:362:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Texture__Group__0 )
            // InternalDsl.g:369:4: rule__Texture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:378:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleBox EOF )
            // InternalDsl.g:380:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:387:1: ruleBox : ( ( rule__Box__Alternatives ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Box__Alternatives ) ) )
            // InternalDsl.g:392:2: ( ( rule__Box__Alternatives ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Box__Alternatives ) )
            // InternalDsl.g:393:3: ( rule__Box__Alternatives )
            {
             before(grammarAccess.getBoxAccess().getAlternatives()); 
            // InternalDsl.g:394:3: ( rule__Box__Alternatives )
            // InternalDsl.g:394:4: rule__Box__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Box__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:403:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleCylinder EOF )
            // InternalDsl.g:405:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:412:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Cylinder__Group__0 )
            // InternalDsl.g:419:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:428:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleMesh EOF )
            // InternalDsl.g:430:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:437:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Mesh__Group__0 )
            // InternalDsl.g:444:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:453:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleSphere EOF )
            // InternalDsl.g:455:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:462:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Sphere__Group__0 )
            // InternalDsl.g:469:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:478:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleLimit EOF )
            // InternalDsl.g:480:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:487:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__Limit__Group__0 )
            // InternalDsl.g:494:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:503:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleAxis EOF )
            // InternalDsl.g:505:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:512:1: ruleAxis : ( ( rule__Axis__Alternatives ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Axis__Alternatives ) ) )
            // InternalDsl.g:517:2: ( ( rule__Axis__Alternatives ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Axis__Alternatives ) )
            // InternalDsl.g:518:3: ( rule__Axis__Alternatives )
            {
             before(grammarAccess.getAxisAccess().getAlternatives()); 
            // InternalDsl.g:519:3: ( rule__Axis__Alternatives )
            // InternalDsl.g:519:4: rule__Axis__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:528:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleCalibration EOF )
            // InternalDsl.g:530:1: ruleCalibration EOF
            {
             before(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getCalibrationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:537:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__Calibration__Group__0 )
            // InternalDsl.g:544:4: rule__Calibration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:553:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleDynamics EOF )
            // InternalDsl.g:555:1: ruleDynamics EOF
            {
             before(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getDynamicsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:562:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__Dynamics__Group__0 )
            // InternalDsl.g:569:4: rule__Dynamics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:578:1: entryRuleMimic : ruleMimic EOF ;
    public final void entryRuleMimic() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleMimic EOF )
            // InternalDsl.g:580:1: ruleMimic EOF
            {
             before(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getMimicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:587:1: ruleMimic : ( ( rule__Mimic__Group__0 ) ) ;
    public final void ruleMimic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__Mimic__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__Mimic__Group__0 )
            {
             before(grammarAccess.getMimicAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__Mimic__Group__0 )
            // InternalDsl.g:594:4: rule__Mimic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:603:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleSafetyController EOF )
            // InternalDsl.g:605:1: ruleSafetyController EOF
            {
             before(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getSafetyControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:612:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__SafetyController__Group__0 )
            // InternalDsl.g:619:4: rule__SafetyController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:628:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleFLOAT EOF )
            // InternalDsl.g:630:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:637:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__FLOAT__Group__0 )
            // InternalDsl.g:644:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:653:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:657:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalDsl.g:658:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalDsl.g:658:2: ( ( rule__JointType__Alternatives ) )
            // InternalDsl.g:659:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalDsl.g:660:3: ( rule__JointType__Alternatives )
            // InternalDsl.g:660:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalDsl.g:668:1: rule__Material__Alternatives : ( ( ruleColor ) | ( ruleTexture ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:672:1: ( ( ruleColor ) | ( ruleTexture ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44||LA1_0==46) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:673:2: ( ruleColor )
                    {
                    // InternalDsl.g:673:2: ( ruleColor )
                    // InternalDsl.g:674:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:679:2: ( ruleTexture )
                    {
                    // InternalDsl.g:679:2: ( ruleTexture )
                    // InternalDsl.g:680:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Geometry__Alternatives"
    // InternalDsl.g:689:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:693:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 52:
            case 54:
                {
                alt2=1;
                }
                break;
            case 57:
                {
                alt2=2;
                }
                break;
            case 59:
                {
                alt2=3;
                }
                break;
            case 61:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:694:2: ( ruleBox )
                    {
                    // InternalDsl.g:694:2: ( ruleBox )
                    // InternalDsl.g:695:3: ruleBox
                    {
                     before(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:700:2: ( ruleCylinder )
                    {
                    // InternalDsl.g:700:2: ( ruleCylinder )
                    // InternalDsl.g:701:3: ruleCylinder
                    {
                     before(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:706:2: ( ruleMesh )
                    {
                    // InternalDsl.g:706:2: ( ruleMesh )
                    // InternalDsl.g:707:3: ruleMesh
                    {
                     before(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMesh();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:712:2: ( ruleSphere )
                    {
                    // InternalDsl.g:712:2: ( ruleSphere )
                    // InternalDsl.g:713:3: ruleSphere
                    {
                     before(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalDsl.g:722:1: rule__Color__Alternatives : ( ( ( rule__Color__Group_0__0 ) ) | ( ( rule__Color__Group_1__0 ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:726:1: ( ( ( rule__Color__Group_0__0 ) ) | ( ( rule__Color__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            else if ( (LA3_0==46) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:727:2: ( ( rule__Color__Group_0__0 ) )
                    {
                    // InternalDsl.g:727:2: ( ( rule__Color__Group_0__0 ) )
                    // InternalDsl.g:728:3: ( rule__Color__Group_0__0 )
                    {
                     before(grammarAccess.getColorAccess().getGroup_0()); 
                    // InternalDsl.g:729:3: ( rule__Color__Group_0__0 )
                    // InternalDsl.g:729:4: rule__Color__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:733:2: ( ( rule__Color__Group_1__0 ) )
                    {
                    // InternalDsl.g:733:2: ( ( rule__Color__Group_1__0 ) )
                    // InternalDsl.g:734:3: ( rule__Color__Group_1__0 )
                    {
                     before(grammarAccess.getColorAccess().getGroup_1()); 
                    // InternalDsl.g:735:3: ( rule__Color__Group_1__0 )
                    // InternalDsl.g:735:4: rule__Color__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Box__Alternatives"
    // InternalDsl.g:743:1: rule__Box__Alternatives : ( ( ( rule__Box__Group_0__0 ) ) | ( ( rule__Box__Group_1__0 ) ) );
    public final void rule__Box__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:747:1: ( ( ( rule__Box__Group_0__0 ) ) | ( ( rule__Box__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                alt4=1;
            }
            else if ( (LA4_0==54) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:748:2: ( ( rule__Box__Group_0__0 ) )
                    {
                    // InternalDsl.g:748:2: ( ( rule__Box__Group_0__0 ) )
                    // InternalDsl.g:749:3: ( rule__Box__Group_0__0 )
                    {
                     before(grammarAccess.getBoxAccess().getGroup_0()); 
                    // InternalDsl.g:750:3: ( rule__Box__Group_0__0 )
                    // InternalDsl.g:750:4: rule__Box__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoxAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:754:2: ( ( rule__Box__Group_1__0 ) )
                    {
                    // InternalDsl.g:754:2: ( ( rule__Box__Group_1__0 ) )
                    // InternalDsl.g:755:3: ( rule__Box__Group_1__0 )
                    {
                     before(grammarAccess.getBoxAccess().getGroup_1()); 
                    // InternalDsl.g:756:3: ( rule__Box__Group_1__0 )
                    // InternalDsl.g:756:4: rule__Box__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoxAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Alternatives"


    // $ANTLR start "rule__Axis__Alternatives"
    // InternalDsl.g:764:1: rule__Axis__Alternatives : ( ( ( rule__Axis__Group_0__0 ) ) | ( ( rule__Axis__Group_1__0 ) ) );
    public final void rule__Axis__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:768:1: ( ( ( rule__Axis__Group_0__0 ) ) | ( ( rule__Axis__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==66) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:769:2: ( ( rule__Axis__Group_0__0 ) )
                    {
                    // InternalDsl.g:769:2: ( ( rule__Axis__Group_0__0 ) )
                    // InternalDsl.g:770:3: ( rule__Axis__Group_0__0 )
                    {
                     before(grammarAccess.getAxisAccess().getGroup_0()); 
                    // InternalDsl.g:771:3: ( rule__Axis__Group_0__0 )
                    // InternalDsl.g:771:4: rule__Axis__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAxisAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:775:2: ( ( rule__Axis__Group_1__0 ) )
                    {
                    // InternalDsl.g:775:2: ( ( rule__Axis__Group_1__0 ) )
                    // InternalDsl.g:776:3: ( rule__Axis__Group_1__0 )
                    {
                     before(grammarAccess.getAxisAccess().getGroup_1()); 
                    // InternalDsl.g:777:3: ( rule__Axis__Group_1__0 )
                    // InternalDsl.g:777:4: rule__Axis__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAxisAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalDsl.g:785:1: rule__JointType__Alternatives : ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:789:1: ( ( ( 'Revolute' ) ) | ( ( 'Continous' ) ) | ( ( 'Fixed' ) ) | ( ( 'Prismatic' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:790:2: ( ( 'Revolute' ) )
                    {
                    // InternalDsl.g:790:2: ( ( 'Revolute' ) )
                    // InternalDsl.g:791:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:792:3: ( 'Revolute' )
                    // InternalDsl.g:792:4: 'Revolute'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:796:2: ( ( 'Continous' ) )
                    {
                    // InternalDsl.g:796:2: ( ( 'Continous' ) )
                    // InternalDsl.g:797:3: ( 'Continous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:798:3: ( 'Continous' )
                    // InternalDsl.g:798:4: 'Continous'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:802:2: ( ( 'Fixed' ) )
                    {
                    // InternalDsl.g:802:2: ( ( 'Fixed' ) )
                    // InternalDsl.g:803:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:804:3: ( 'Fixed' )
                    // InternalDsl.g:804:4: 'Fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:808:2: ( ( 'Prismatic' ) )
                    {
                    // InternalDsl.g:808:2: ( ( 'Prismatic' ) )
                    // InternalDsl.g:809:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:810:3: ( 'Prismatic' )
                    // InternalDsl.g:810:4: 'Prismatic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalDsl.g:818:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:822:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalDsl.g:823:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalDsl.g:830:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:834:1: ( ( 'Robot' ) )
            // InternalDsl.g:835:1: ( 'Robot' )
            {
            // InternalDsl.g:835:1: ( 'Robot' )
            // InternalDsl.g:836:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalDsl.g:845:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:849:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalDsl.g:850:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalDsl.g:857:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:861:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalDsl.g:862:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalDsl.g:862:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalDsl.g:863:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalDsl.g:864:2: ( rule__Robot__NameAssignment_1 )
            // InternalDsl.g:864:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalDsl.g:872:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:876:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalDsl.g:877:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalDsl.g:884:1: rule__Robot__Group__2__Impl : ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:888:1: ( ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) ) )
            // InternalDsl.g:889:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) )
            {
            // InternalDsl.g:889:1: ( ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* ) )
            // InternalDsl.g:890:2: ( ( rule__Robot__LinkAssignment_2 ) ) ( ( rule__Robot__LinkAssignment_2 )* )
            {
            // InternalDsl.g:890:2: ( ( rule__Robot__LinkAssignment_2 ) )
            // InternalDsl.g:891:3: ( rule__Robot__LinkAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:892:3: ( rule__Robot__LinkAssignment_2 )
            // InternalDsl.g:892:4: rule__Robot__LinkAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Robot__LinkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }

            // InternalDsl.g:895:2: ( ( rule__Robot__LinkAssignment_2 )* )
            // InternalDsl.g:896:3: ( rule__Robot__LinkAssignment_2 )*
            {
             before(grammarAccess.getRobotAccess().getLinkAssignment_2()); 
            // InternalDsl.g:897:3: ( rule__Robot__LinkAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:897:4: rule__Robot__LinkAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Robot__LinkAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getLinkAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalDsl.g:906:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:910:1: ( rule__Robot__Group__3__Impl )
            // InternalDsl.g:911:2: rule__Robot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalDsl.g:917:1: rule__Robot__Group__3__Impl : ( ( rule__Robot__JointAssignment_3 )* ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( ( ( rule__Robot__JointAssignment_3 )* ) )
            // InternalDsl.g:922:1: ( ( rule__Robot__JointAssignment_3 )* )
            {
            // InternalDsl.g:922:1: ( ( rule__Robot__JointAssignment_3 )* )
            // InternalDsl.g:923:2: ( rule__Robot__JointAssignment_3 )*
            {
             before(grammarAccess.getRobotAccess().getJointAssignment_3()); 
            // InternalDsl.g:924:2: ( rule__Robot__JointAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:924:3: rule__Robot__JointAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Robot__JointAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getJointAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalDsl.g:933:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:937:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalDsl.g:938:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalDsl.g:945:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:949:1: ( ( () ) )
            // InternalDsl.g:950:1: ( () )
            {
            // InternalDsl.g:950:1: ( () )
            // InternalDsl.g:951:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalDsl.g:952:2: ()
            // InternalDsl.g:952:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalDsl.g:960:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:964:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalDsl.g:965:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalDsl.g:972:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:976:1: ( ( 'Link' ) )
            // InternalDsl.g:977:1: ( 'Link' )
            {
            // InternalDsl.g:977:1: ( 'Link' )
            // InternalDsl.g:978:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalDsl.g:987:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:991:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalDsl.g:992:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalDsl.g:999:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1003:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalDsl.g:1004:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalDsl.g:1004:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalDsl.g:1005:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalDsl.g:1006:2: ( rule__Link__NameAssignment_2 )
            // InternalDsl.g:1006:3: rule__Link__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalDsl.g:1014:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1018:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalDsl.g:1019:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalDsl.g:1026:1: rule__Link__Group__3__Impl : ( ( rule__Link__VisualsAssignment_3 )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1030:1: ( ( ( rule__Link__VisualsAssignment_3 )* ) )
            // InternalDsl.g:1031:1: ( ( rule__Link__VisualsAssignment_3 )* )
            {
            // InternalDsl.g:1031:1: ( ( rule__Link__VisualsAssignment_3 )* )
            // InternalDsl.g:1032:2: ( rule__Link__VisualsAssignment_3 )*
            {
             before(grammarAccess.getLinkAccess().getVisualsAssignment_3()); 
            // InternalDsl.g:1033:2: ( rule__Link__VisualsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1033:3: rule__Link__VisualsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Link__VisualsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getVisualsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalDsl.g:1041:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1045:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalDsl.g:1046:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalDsl.g:1053:1: rule__Link__Group__4__Impl : ( ( rule__Link__InertialAssignment_4 )* ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1057:1: ( ( ( rule__Link__InertialAssignment_4 )* ) )
            // InternalDsl.g:1058:1: ( ( rule__Link__InertialAssignment_4 )* )
            {
            // InternalDsl.g:1058:1: ( ( rule__Link__InertialAssignment_4 )* )
            // InternalDsl.g:1059:2: ( rule__Link__InertialAssignment_4 )*
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_4()); 
            // InternalDsl.g:1060:2: ( rule__Link__InertialAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1060:3: rule__Link__InertialAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Link__InertialAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getInertialAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalDsl.g:1068:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1072:1: ( rule__Link__Group__5__Impl )
            // InternalDsl.g:1073:2: rule__Link__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalDsl.g:1079:1: rule__Link__Group__5__Impl : ( ( rule__Link__Group_5__0 )? ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1083:1: ( ( ( rule__Link__Group_5__0 )? ) )
            // InternalDsl.g:1084:1: ( ( rule__Link__Group_5__0 )? )
            {
            // InternalDsl.g:1084:1: ( ( rule__Link__Group_5__0 )? )
            // InternalDsl.g:1085:2: ( rule__Link__Group_5__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_5()); 
            // InternalDsl.g:1086:2: ( rule__Link__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1086:3: rule__Link__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group_5__0"
    // InternalDsl.g:1095:1: rule__Link__Group_5__0 : rule__Link__Group_5__0__Impl rule__Link__Group_5__1 ;
    public final void rule__Link__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1099:1: ( rule__Link__Group_5__0__Impl rule__Link__Group_5__1 )
            // InternalDsl.g:1100:2: rule__Link__Group_5__0__Impl rule__Link__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__0"


    // $ANTLR start "rule__Link__Group_5__0__Impl"
    // InternalDsl.g:1107:1: rule__Link__Group_5__0__Impl : ( 'Collision' ) ;
    public final void rule__Link__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1111:1: ( ( 'Collision' ) )
            // InternalDsl.g:1112:1: ( 'Collision' )
            {
            // InternalDsl.g:1112:1: ( 'Collision' )
            // InternalDsl.g:1113:2: 'Collision'
            {
             before(grammarAccess.getLinkAccess().getCollisionKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCollisionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__0__Impl"


    // $ANTLR start "rule__Link__Group_5__1"
    // InternalDsl.g:1122:1: rule__Link__Group_5__1 : rule__Link__Group_5__1__Impl ;
    public final void rule__Link__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1126:1: ( rule__Link__Group_5__1__Impl )
            // InternalDsl.g:1127:2: rule__Link__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__1"


    // $ANTLR start "rule__Link__Group_5__1__Impl"
    // InternalDsl.g:1133:1: rule__Link__Group_5__1__Impl : ( ( rule__Link__CollisionAssignment_5_1 )* ) ;
    public final void rule__Link__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1137:1: ( ( ( rule__Link__CollisionAssignment_5_1 )* ) )
            // InternalDsl.g:1138:1: ( ( rule__Link__CollisionAssignment_5_1 )* )
            {
            // InternalDsl.g:1138:1: ( ( rule__Link__CollisionAssignment_5_1 )* )
            // InternalDsl.g:1139:2: ( rule__Link__CollisionAssignment_5_1 )*
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_5_1()); 
            // InternalDsl.g:1140:2: ( rule__Link__CollisionAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1140:3: rule__Link__CollisionAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Link__CollisionAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getCollisionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_5__1__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalDsl.g:1149:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1153:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalDsl.g:1154:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalDsl.g:1161:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1165:1: ( ( 'Joint' ) )
            // InternalDsl.g:1166:1: ( 'Joint' )
            {
            // InternalDsl.g:1166:1: ( 'Joint' )
            // InternalDsl.g:1167:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalDsl.g:1176:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1180:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalDsl.g:1181:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalDsl.g:1188:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1192:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalDsl.g:1193:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalDsl.g:1193:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalDsl.g:1194:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalDsl.g:1195:2: ( rule__Joint__NameAssignment_1 )
            // InternalDsl.g:1195:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalDsl.g:1203:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1207:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalDsl.g:1208:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalDsl.g:1215:1: rule__Joint__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1219:1: ( ( 'Type' ) )
            // InternalDsl.g:1220:1: ( 'Type' )
            {
            // InternalDsl.g:1220:1: ( 'Type' )
            // InternalDsl.g:1221:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalDsl.g:1230:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1234:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalDsl.g:1235:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalDsl.g:1242:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1246:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // InternalDsl.g:1247:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // InternalDsl.g:1247:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // InternalDsl.g:1248:2: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // InternalDsl.g:1249:2: ( rule__Joint__TypeAssignment_3 )
            // InternalDsl.g:1249:3: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalDsl.g:1257:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1261:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalDsl.g:1262:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalDsl.g:1269:1: rule__Joint__Group__4__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1273:1: ( ( 'ChildOf' ) )
            // InternalDsl.g:1274:1: ( 'ChildOf' )
            {
            // InternalDsl.g:1274:1: ( 'ChildOf' )
            // InternalDsl.g:1275:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalDsl.g:1284:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1288:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalDsl.g:1289:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalDsl.g:1296:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__ChildOfAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1300:1: ( ( ( rule__Joint__ChildOfAssignment_5 ) ) )
            // InternalDsl.g:1301:1: ( ( rule__Joint__ChildOfAssignment_5 ) )
            {
            // InternalDsl.g:1301:1: ( ( rule__Joint__ChildOfAssignment_5 ) )
            // InternalDsl.g:1302:2: ( rule__Joint__ChildOfAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_5()); 
            // InternalDsl.g:1303:2: ( rule__Joint__ChildOfAssignment_5 )
            // InternalDsl.g:1303:3: rule__Joint__ChildOfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalDsl.g:1311:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1315:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalDsl.g:1316:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalDsl.g:1323:1: rule__Joint__Group__6__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1327:1: ( ( 'ParentOf' ) )
            // InternalDsl.g:1328:1: ( 'ParentOf' )
            {
            // InternalDsl.g:1328:1: ( 'ParentOf' )
            // InternalDsl.g:1329:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalDsl.g:1338:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1342:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalDsl.g:1343:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalDsl.g:1350:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__ParentOfAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1354:1: ( ( ( rule__Joint__ParentOfAssignment_7 ) ) )
            // InternalDsl.g:1355:1: ( ( rule__Joint__ParentOfAssignment_7 ) )
            {
            // InternalDsl.g:1355:1: ( ( rule__Joint__ParentOfAssignment_7 ) )
            // InternalDsl.g:1356:2: ( rule__Joint__ParentOfAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_7()); 
            // InternalDsl.g:1357:2: ( rule__Joint__ParentOfAssignment_7 )
            // InternalDsl.g:1357:3: rule__Joint__ParentOfAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalDsl.g:1365:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1369:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalDsl.g:1370:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalDsl.g:1377:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__Group_8__0 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1381:1: ( ( ( rule__Joint__Group_8__0 )? ) )
            // InternalDsl.g:1382:1: ( ( rule__Joint__Group_8__0 )? )
            {
            // InternalDsl.g:1382:1: ( ( rule__Joint__Group_8__0 )? )
            // InternalDsl.g:1383:2: ( rule__Joint__Group_8__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_8()); 
            // InternalDsl.g:1384:2: ( rule__Joint__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1384:3: rule__Joint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // InternalDsl.g:1392:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1396:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalDsl.g:1397:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // InternalDsl.g:1404:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__Group_9__0 )? ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1408:1: ( ( ( rule__Joint__Group_9__0 )? ) )
            // InternalDsl.g:1409:1: ( ( rule__Joint__Group_9__0 )? )
            {
            // InternalDsl.g:1409:1: ( ( rule__Joint__Group_9__0 )? )
            // InternalDsl.g:1410:2: ( rule__Joint__Group_9__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_9()); 
            // InternalDsl.g:1411:2: ( rule__Joint__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1411:3: rule__Joint__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // InternalDsl.g:1419:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1423:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalDsl.g:1424:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // InternalDsl.g:1431:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__Group_10__0 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1435:1: ( ( ( rule__Joint__Group_10__0 )? ) )
            // InternalDsl.g:1436:1: ( ( rule__Joint__Group_10__0 )? )
            {
            // InternalDsl.g:1436:1: ( ( rule__Joint__Group_10__0 )? )
            // InternalDsl.g:1437:2: ( rule__Joint__Group_10__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_10()); 
            // InternalDsl.g:1438:2: ( rule__Joint__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1438:3: rule__Joint__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group__11"
    // InternalDsl.g:1446:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1450:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalDsl.g:1451:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // InternalDsl.g:1458:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__Group_11__0 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1462:1: ( ( ( rule__Joint__Group_11__0 )? ) )
            // InternalDsl.g:1463:1: ( ( rule__Joint__Group_11__0 )? )
            {
            // InternalDsl.g:1463:1: ( ( rule__Joint__Group_11__0 )? )
            // InternalDsl.g:1464:2: ( rule__Joint__Group_11__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_11()); 
            // InternalDsl.g:1465:2: ( rule__Joint__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1465:3: rule__Joint__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Joint__Group__12"
    // InternalDsl.g:1473:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1477:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // InternalDsl.g:1478:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12"


    // $ANTLR start "rule__Joint__Group__12__Impl"
    // InternalDsl.g:1485:1: rule__Joint__Group__12__Impl : ( ( rule__Joint__Group_12__0 )? ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1489:1: ( ( ( rule__Joint__Group_12__0 )? ) )
            // InternalDsl.g:1490:1: ( ( rule__Joint__Group_12__0 )? )
            {
            // InternalDsl.g:1490:1: ( ( rule__Joint__Group_12__0 )? )
            // InternalDsl.g:1491:2: ( rule__Joint__Group_12__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_12()); 
            // InternalDsl.g:1492:2: ( rule__Joint__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1492:3: rule__Joint__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12__Impl"


    // $ANTLR start "rule__Joint__Group__13"
    // InternalDsl.g:1500:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1504:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // InternalDsl.g:1505:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13"


    // $ANTLR start "rule__Joint__Group__13__Impl"
    // InternalDsl.g:1512:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__Group_13__0 )? ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1516:1: ( ( ( rule__Joint__Group_13__0 )? ) )
            // InternalDsl.g:1517:1: ( ( rule__Joint__Group_13__0 )? )
            {
            // InternalDsl.g:1517:1: ( ( rule__Joint__Group_13__0 )? )
            // InternalDsl.g:1518:2: ( rule__Joint__Group_13__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_13()); 
            // InternalDsl.g:1519:2: ( rule__Joint__Group_13__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1519:3: rule__Joint__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13__Impl"


    // $ANTLR start "rule__Joint__Group__14"
    // InternalDsl.g:1527:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1531:1: ( rule__Joint__Group__14__Impl )
            // InternalDsl.g:1532:2: rule__Joint__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14"


    // $ANTLR start "rule__Joint__Group__14__Impl"
    // InternalDsl.g:1538:1: rule__Joint__Group__14__Impl : ( ( rule__Joint__Group_14__0 )? ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( ( ( rule__Joint__Group_14__0 )? ) )
            // InternalDsl.g:1543:1: ( ( rule__Joint__Group_14__0 )? )
            {
            // InternalDsl.g:1543:1: ( ( rule__Joint__Group_14__0 )? )
            // InternalDsl.g:1544:2: ( rule__Joint__Group_14__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_14()); 
            // InternalDsl.g:1545:2: ( rule__Joint__Group_14__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1545:3: rule__Joint__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14__Impl"


    // $ANTLR start "rule__Joint__Group_8__0"
    // InternalDsl.g:1554:1: rule__Joint__Group_8__0 : rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 ;
    public final void rule__Joint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1558:1: ( rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 )
            // InternalDsl.g:1559:2: rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Joint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0"


    // $ANTLR start "rule__Joint__Group_8__0__Impl"
    // InternalDsl.g:1566:1: rule__Joint__Group_8__0__Impl : ( 'Limit' ) ;
    public final void rule__Joint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1570:1: ( ( 'Limit' ) )
            // InternalDsl.g:1571:1: ( 'Limit' )
            {
            // InternalDsl.g:1571:1: ( 'Limit' )
            // InternalDsl.g:1572:2: 'Limit'
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0__Impl"


    // $ANTLR start "rule__Joint__Group_8__1"
    // InternalDsl.g:1581:1: rule__Joint__Group_8__1 : rule__Joint__Group_8__1__Impl ;
    public final void rule__Joint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1585:1: ( rule__Joint__Group_8__1__Impl )
            // InternalDsl.g:1586:2: rule__Joint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1"


    // $ANTLR start "rule__Joint__Group_8__1__Impl"
    // InternalDsl.g:1592:1: rule__Joint__Group_8__1__Impl : ( ( rule__Joint__LimitAssignment_8_1 ) ) ;
    public final void rule__Joint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1596:1: ( ( ( rule__Joint__LimitAssignment_8_1 ) ) )
            // InternalDsl.g:1597:1: ( ( rule__Joint__LimitAssignment_8_1 ) )
            {
            // InternalDsl.g:1597:1: ( ( rule__Joint__LimitAssignment_8_1 ) )
            // InternalDsl.g:1598:2: ( rule__Joint__LimitAssignment_8_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_8_1()); 
            // InternalDsl.g:1599:2: ( rule__Joint__LimitAssignment_8_1 )
            // InternalDsl.g:1599:3: rule__Joint__LimitAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1__Impl"


    // $ANTLR start "rule__Joint__Group_9__0"
    // InternalDsl.g:1608:1: rule__Joint__Group_9__0 : rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1 ;
    public final void rule__Joint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1612:1: ( rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1 )
            // InternalDsl.g:1613:2: rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1
            {
            pushFollow(FOLLOW_18);
            rule__Joint__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__0"


    // $ANTLR start "rule__Joint__Group_9__0__Impl"
    // InternalDsl.g:1620:1: rule__Joint__Group_9__0__Impl : ( 'Axis' ) ;
    public final void rule__Joint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1624:1: ( ( 'Axis' ) )
            // InternalDsl.g:1625:1: ( 'Axis' )
            {
            // InternalDsl.g:1625:1: ( 'Axis' )
            // InternalDsl.g:1626:2: 'Axis'
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__0__Impl"


    // $ANTLR start "rule__Joint__Group_9__1"
    // InternalDsl.g:1635:1: rule__Joint__Group_9__1 : rule__Joint__Group_9__1__Impl ;
    public final void rule__Joint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1639:1: ( rule__Joint__Group_9__1__Impl )
            // InternalDsl.g:1640:2: rule__Joint__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__1"


    // $ANTLR start "rule__Joint__Group_9__1__Impl"
    // InternalDsl.g:1646:1: rule__Joint__Group_9__1__Impl : ( ( rule__Joint__AxisAssignment_9_1 ) ) ;
    public final void rule__Joint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1650:1: ( ( ( rule__Joint__AxisAssignment_9_1 ) ) )
            // InternalDsl.g:1651:1: ( ( rule__Joint__AxisAssignment_9_1 ) )
            {
            // InternalDsl.g:1651:1: ( ( rule__Joint__AxisAssignment_9_1 ) )
            // InternalDsl.g:1652:2: ( rule__Joint__AxisAssignment_9_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_9_1()); 
            // InternalDsl.g:1653:2: ( rule__Joint__AxisAssignment_9_1 )
            // InternalDsl.g:1653:3: rule__Joint__AxisAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__1__Impl"


    // $ANTLR start "rule__Joint__Group_10__0"
    // InternalDsl.g:1662:1: rule__Joint__Group_10__0 : rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 ;
    public final void rule__Joint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1666:1: ( rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1 )
            // InternalDsl.g:1667:2: rule__Joint__Group_10__0__Impl rule__Joint__Group_10__1
            {
            pushFollow(FOLLOW_19);
            rule__Joint__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__0"


    // $ANTLR start "rule__Joint__Group_10__0__Impl"
    // InternalDsl.g:1674:1: rule__Joint__Group_10__0__Impl : ( 'Origin' ) ;
    public final void rule__Joint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1678:1: ( ( 'Origin' ) )
            // InternalDsl.g:1679:1: ( 'Origin' )
            {
            // InternalDsl.g:1679:1: ( 'Origin' )
            // InternalDsl.g:1680:2: 'Origin'
            {
             before(grammarAccess.getJointAccess().getOriginKeyword_10_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getOriginKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__0__Impl"


    // $ANTLR start "rule__Joint__Group_10__1"
    // InternalDsl.g:1689:1: rule__Joint__Group_10__1 : rule__Joint__Group_10__1__Impl ;
    public final void rule__Joint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1693:1: ( rule__Joint__Group_10__1__Impl )
            // InternalDsl.g:1694:2: rule__Joint__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__1"


    // $ANTLR start "rule__Joint__Group_10__1__Impl"
    // InternalDsl.g:1700:1: rule__Joint__Group_10__1__Impl : ( ( rule__Joint__OriginAssignment_10_1 ) ) ;
    public final void rule__Joint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( ( ( rule__Joint__OriginAssignment_10_1 ) ) )
            // InternalDsl.g:1705:1: ( ( rule__Joint__OriginAssignment_10_1 ) )
            {
            // InternalDsl.g:1705:1: ( ( rule__Joint__OriginAssignment_10_1 ) )
            // InternalDsl.g:1706:2: ( rule__Joint__OriginAssignment_10_1 )
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_10_1()); 
            // InternalDsl.g:1707:2: ( rule__Joint__OriginAssignment_10_1 )
            // InternalDsl.g:1707:3: rule__Joint__OriginAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__OriginAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getOriginAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_10__1__Impl"


    // $ANTLR start "rule__Joint__Group_11__0"
    // InternalDsl.g:1716:1: rule__Joint__Group_11__0 : rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 ;
    public final void rule__Joint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1720:1: ( rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 )
            // InternalDsl.g:1721:2: rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1
            {
            pushFollow(FOLLOW_20);
            rule__Joint__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0"


    // $ANTLR start "rule__Joint__Group_11__0__Impl"
    // InternalDsl.g:1728:1: rule__Joint__Group_11__0__Impl : ( 'Calibration' ) ;
    public final void rule__Joint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1732:1: ( ( 'Calibration' ) )
            // InternalDsl.g:1733:1: ( 'Calibration' )
            {
            // InternalDsl.g:1733:1: ( 'Calibration' )
            // InternalDsl.g:1734:2: 'Calibration'
            {
             before(grammarAccess.getJointAccess().getCalibrationKeyword_11_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getCalibrationKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0__Impl"


    // $ANTLR start "rule__Joint__Group_11__1"
    // InternalDsl.g:1743:1: rule__Joint__Group_11__1 : rule__Joint__Group_11__1__Impl ;
    public final void rule__Joint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1747:1: ( rule__Joint__Group_11__1__Impl )
            // InternalDsl.g:1748:2: rule__Joint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1"


    // $ANTLR start "rule__Joint__Group_11__1__Impl"
    // InternalDsl.g:1754:1: rule__Joint__Group_11__1__Impl : ( ( rule__Joint__CalibrationAssignment_11_1 ) ) ;
    public final void rule__Joint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1758:1: ( ( ( rule__Joint__CalibrationAssignment_11_1 ) ) )
            // InternalDsl.g:1759:1: ( ( rule__Joint__CalibrationAssignment_11_1 ) )
            {
            // InternalDsl.g:1759:1: ( ( rule__Joint__CalibrationAssignment_11_1 ) )
            // InternalDsl.g:1760:2: ( rule__Joint__CalibrationAssignment_11_1 )
            {
             before(grammarAccess.getJointAccess().getCalibrationAssignment_11_1()); 
            // InternalDsl.g:1761:2: ( rule__Joint__CalibrationAssignment_11_1 )
            // InternalDsl.g:1761:3: rule__Joint__CalibrationAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__CalibrationAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getCalibrationAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1__Impl"


    // $ANTLR start "rule__Joint__Group_12__0"
    // InternalDsl.g:1770:1: rule__Joint__Group_12__0 : rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 ;
    public final void rule__Joint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1774:1: ( rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 )
            // InternalDsl.g:1775:2: rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1
            {
            pushFollow(FOLLOW_21);
            rule__Joint__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0"


    // $ANTLR start "rule__Joint__Group_12__0__Impl"
    // InternalDsl.g:1782:1: rule__Joint__Group_12__0__Impl : ( 'Dynamics' ) ;
    public final void rule__Joint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1786:1: ( ( 'Dynamics' ) )
            // InternalDsl.g:1787:1: ( 'Dynamics' )
            {
            // InternalDsl.g:1787:1: ( 'Dynamics' )
            // InternalDsl.g:1788:2: 'Dynamics'
            {
             before(grammarAccess.getJointAccess().getDynamicsKeyword_12_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getDynamicsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0__Impl"


    // $ANTLR start "rule__Joint__Group_12__1"
    // InternalDsl.g:1797:1: rule__Joint__Group_12__1 : rule__Joint__Group_12__1__Impl ;
    public final void rule__Joint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1801:1: ( rule__Joint__Group_12__1__Impl )
            // InternalDsl.g:1802:2: rule__Joint__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1"


    // $ANTLR start "rule__Joint__Group_12__1__Impl"
    // InternalDsl.g:1808:1: rule__Joint__Group_12__1__Impl : ( ( rule__Joint__DynamicsAssignment_12_1 ) ) ;
    public final void rule__Joint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1812:1: ( ( ( rule__Joint__DynamicsAssignment_12_1 ) ) )
            // InternalDsl.g:1813:1: ( ( rule__Joint__DynamicsAssignment_12_1 ) )
            {
            // InternalDsl.g:1813:1: ( ( rule__Joint__DynamicsAssignment_12_1 ) )
            // InternalDsl.g:1814:2: ( rule__Joint__DynamicsAssignment_12_1 )
            {
             before(grammarAccess.getJointAccess().getDynamicsAssignment_12_1()); 
            // InternalDsl.g:1815:2: ( rule__Joint__DynamicsAssignment_12_1 )
            // InternalDsl.g:1815:3: rule__Joint__DynamicsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__DynamicsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDynamicsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1__Impl"


    // $ANTLR start "rule__Joint__Group_13__0"
    // InternalDsl.g:1824:1: rule__Joint__Group_13__0 : rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 ;
    public final void rule__Joint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1828:1: ( rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 )
            // InternalDsl.g:1829:2: rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1
            {
            pushFollow(FOLLOW_22);
            rule__Joint__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0"


    // $ANTLR start "rule__Joint__Group_13__0__Impl"
    // InternalDsl.g:1836:1: rule__Joint__Group_13__0__Impl : ( 'Mimic' ) ;
    public final void rule__Joint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1840:1: ( ( 'Mimic' ) )
            // InternalDsl.g:1841:1: ( 'Mimic' )
            {
            // InternalDsl.g:1841:1: ( 'Mimic' )
            // InternalDsl.g:1842:2: 'Mimic'
            {
             before(grammarAccess.getJointAccess().getMimicKeyword_13_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getMimicKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0__Impl"


    // $ANTLR start "rule__Joint__Group_13__1"
    // InternalDsl.g:1851:1: rule__Joint__Group_13__1 : rule__Joint__Group_13__1__Impl ;
    public final void rule__Joint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1855:1: ( rule__Joint__Group_13__1__Impl )
            // InternalDsl.g:1856:2: rule__Joint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1"


    // $ANTLR start "rule__Joint__Group_13__1__Impl"
    // InternalDsl.g:1862:1: rule__Joint__Group_13__1__Impl : ( ( rule__Joint__MimicAssignment_13_1 ) ) ;
    public final void rule__Joint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1866:1: ( ( ( rule__Joint__MimicAssignment_13_1 ) ) )
            // InternalDsl.g:1867:1: ( ( rule__Joint__MimicAssignment_13_1 ) )
            {
            // InternalDsl.g:1867:1: ( ( rule__Joint__MimicAssignment_13_1 ) )
            // InternalDsl.g:1868:2: ( rule__Joint__MimicAssignment_13_1 )
            {
             before(grammarAccess.getJointAccess().getMimicAssignment_13_1()); 
            // InternalDsl.g:1869:2: ( rule__Joint__MimicAssignment_13_1 )
            // InternalDsl.g:1869:3: rule__Joint__MimicAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__MimicAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getMimicAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1__Impl"


    // $ANTLR start "rule__Joint__Group_14__0"
    // InternalDsl.g:1878:1: rule__Joint__Group_14__0 : rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1 ;
    public final void rule__Joint__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1882:1: ( rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1 )
            // InternalDsl.g:1883:2: rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1
            {
            pushFollow(FOLLOW_23);
            rule__Joint__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__0"


    // $ANTLR start "rule__Joint__Group_14__0__Impl"
    // InternalDsl.g:1890:1: rule__Joint__Group_14__0__Impl : ( 'SafetyController' ) ;
    public final void rule__Joint__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1894:1: ( ( 'SafetyController' ) )
            // InternalDsl.g:1895:1: ( 'SafetyController' )
            {
            // InternalDsl.g:1895:1: ( 'SafetyController' )
            // InternalDsl.g:1896:2: 'SafetyController'
            {
             before(grammarAccess.getJointAccess().getSafetyControllerKeyword_14_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getSafetyControllerKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__0__Impl"


    // $ANTLR start "rule__Joint__Group_14__1"
    // InternalDsl.g:1905:1: rule__Joint__Group_14__1 : rule__Joint__Group_14__1__Impl ;
    public final void rule__Joint__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1909:1: ( rule__Joint__Group_14__1__Impl )
            // InternalDsl.g:1910:2: rule__Joint__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__1"


    // $ANTLR start "rule__Joint__Group_14__1__Impl"
    // InternalDsl.g:1916:1: rule__Joint__Group_14__1__Impl : ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) ) ;
    public final void rule__Joint__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1920:1: ( ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) ) )
            // InternalDsl.g:1921:1: ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) )
            {
            // InternalDsl.g:1921:1: ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) )
            // InternalDsl.g:1922:2: ( rule__Joint__SafetycontrollerAssignment_14_1 )
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_14_1()); 
            // InternalDsl.g:1923:2: ( rule__Joint__SafetycontrollerAssignment_14_1 )
            // InternalDsl.g:1923:3: rule__Joint__SafetycontrollerAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__SafetycontrollerAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSafetycontrollerAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__1__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalDsl.g:1932:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1936:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalDsl.g:1937:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Inertial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0"


    // $ANTLR start "rule__Inertial__Group__0__Impl"
    // InternalDsl.g:1944:1: rule__Inertial__Group__0__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1948:1: ( ( 'Inertial' ) )
            // InternalDsl.g:1949:1: ( 'Inertial' )
            {
            // InternalDsl.g:1949:1: ( 'Inertial' )
            // InternalDsl.g:1950:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0__Impl"


    // $ANTLR start "rule__Inertial__Group__1"
    // InternalDsl.g:1959:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1963:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalDsl.g:1964:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Inertial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1"


    // $ANTLR start "rule__Inertial__Group__1__Impl"
    // InternalDsl.g:1971:1: rule__Inertial__Group__1__Impl : ( ( rule__Inertial__NameAssignment_1 )? ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1975:1: ( ( ( rule__Inertial__NameAssignment_1 )? ) )
            // InternalDsl.g:1976:1: ( ( rule__Inertial__NameAssignment_1 )? )
            {
            // InternalDsl.g:1976:1: ( ( rule__Inertial__NameAssignment_1 )? )
            // InternalDsl.g:1977:2: ( rule__Inertial__NameAssignment_1 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_1()); 
            // InternalDsl.g:1978:2: ( rule__Inertial__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1978:3: rule__Inertial__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__2"
    // InternalDsl.g:1986:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1990:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalDsl.g:1991:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Inertial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2"


    // $ANTLR start "rule__Inertial__Group__2__Impl"
    // InternalDsl.g:1998:1: rule__Inertial__Group__2__Impl : ( 'Inertia' ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2002:1: ( ( 'Inertia' ) )
            // InternalDsl.g:2003:1: ( 'Inertia' )
            {
            // InternalDsl.g:2003:1: ( 'Inertia' )
            // InternalDsl.g:2004:2: 'Inertia'
            {
             before(grammarAccess.getInertialAccess().getInertiaKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertiaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2__Impl"


    // $ANTLR start "rule__Inertial__Group__3"
    // InternalDsl.g:2013:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2017:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalDsl.g:2018:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Inertial__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3"


    // $ANTLR start "rule__Inertial__Group__3__Impl"
    // InternalDsl.g:2025:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2029:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalDsl.g:2030:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalDsl.g:2030:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalDsl.g:2031:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalDsl.g:2032:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalDsl.g:2032:3: rule__Inertial__InertiaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3__Impl"


    // $ANTLR start "rule__Inertial__Group__4"
    // InternalDsl.g:2040:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2044:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalDsl.g:2045:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Inertial__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__4"


    // $ANTLR start "rule__Inertial__Group__4__Impl"
    // InternalDsl.g:2052:1: rule__Inertial__Group__4__Impl : ( 'Mass' ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2056:1: ( ( 'Mass' ) )
            // InternalDsl.g:2057:1: ( 'Mass' )
            {
            // InternalDsl.g:2057:1: ( 'Mass' )
            // InternalDsl.g:2058:2: 'Mass'
            {
             before(grammarAccess.getInertialAccess().getMassKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getMassKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__4__Impl"


    // $ANTLR start "rule__Inertial__Group__5"
    // InternalDsl.g:2067:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl rule__Inertial__Group__6 ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2071:1: ( rule__Inertial__Group__5__Impl rule__Inertial__Group__6 )
            // InternalDsl.g:2072:2: rule__Inertial__Group__5__Impl rule__Inertial__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Inertial__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__5"


    // $ANTLR start "rule__Inertial__Group__5__Impl"
    // InternalDsl.g:2079:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__MassAssignment_5 ) ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2083:1: ( ( ( rule__Inertial__MassAssignment_5 ) ) )
            // InternalDsl.g:2084:1: ( ( rule__Inertial__MassAssignment_5 ) )
            {
            // InternalDsl.g:2084:1: ( ( rule__Inertial__MassAssignment_5 ) )
            // InternalDsl.g:2085:2: ( rule__Inertial__MassAssignment_5 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_5()); 
            // InternalDsl.g:2086:2: ( rule__Inertial__MassAssignment_5 )
            // InternalDsl.g:2086:3: rule__Inertial__MassAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__5__Impl"


    // $ANTLR start "rule__Inertial__Group__6"
    // InternalDsl.g:2094:1: rule__Inertial__Group__6 : rule__Inertial__Group__6__Impl ;
    public final void rule__Inertial__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2098:1: ( rule__Inertial__Group__6__Impl )
            // InternalDsl.g:2099:2: rule__Inertial__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__6"


    // $ANTLR start "rule__Inertial__Group__6__Impl"
    // InternalDsl.g:2105:1: rule__Inertial__Group__6__Impl : ( ( rule__Inertial__OriginAssignment_6 )? ) ;
    public final void rule__Inertial__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2109:1: ( ( ( rule__Inertial__OriginAssignment_6 )? ) )
            // InternalDsl.g:2110:1: ( ( rule__Inertial__OriginAssignment_6 )? )
            {
            // InternalDsl.g:2110:1: ( ( rule__Inertial__OriginAssignment_6 )? )
            // InternalDsl.g:2111:2: ( rule__Inertial__OriginAssignment_6 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_6()); 
            // InternalDsl.g:2112:2: ( rule__Inertial__OriginAssignment_6 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2112:3: rule__Inertial__OriginAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__OriginAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__6__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalDsl.g:2121:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2125:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalDsl.g:2126:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalDsl.g:2133:1: rule__Visual__Group__0__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2137:1: ( ( 'Visual' ) )
            // InternalDsl.g:2138:1: ( 'Visual' )
            {
            // InternalDsl.g:2138:1: ( 'Visual' )
            // InternalDsl.g:2139:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getVisualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalDsl.g:2148:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2152:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalDsl.g:2153:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalDsl.g:2160:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__NameAssignment_1 )? ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2164:1: ( ( ( rule__Visual__NameAssignment_1 )? ) )
            // InternalDsl.g:2165:1: ( ( rule__Visual__NameAssignment_1 )? )
            {
            // InternalDsl.g:2165:1: ( ( rule__Visual__NameAssignment_1 )? )
            // InternalDsl.g:2166:2: ( rule__Visual__NameAssignment_1 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_1()); 
            // InternalDsl.g:2167:2: ( rule__Visual__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2167:3: rule__Visual__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalDsl.g:2175:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2179:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalDsl.g:2180:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Visual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalDsl.g:2187:1: rule__Visual__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2191:1: ( ( 'Geometry' ) )
            // InternalDsl.g:2192:1: ( 'Geometry' )
            {
            // InternalDsl.g:2192:1: ( 'Geometry' )
            // InternalDsl.g:2193:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__3"
    // InternalDsl.g:2202:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2206:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalDsl.g:2207:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Visual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3"


    // $ANTLR start "rule__Visual__Group__3__Impl"
    // InternalDsl.g:2214:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__GeometryAssignment_3 ) ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2218:1: ( ( ( rule__Visual__GeometryAssignment_3 ) ) )
            // InternalDsl.g:2219:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            {
            // InternalDsl.g:2219:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            // InternalDsl.g:2220:2: ( rule__Visual__GeometryAssignment_3 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 
            // InternalDsl.g:2221:2: ( rule__Visual__GeometryAssignment_3 )
            // InternalDsl.g:2221:3: rule__Visual__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3__Impl"


    // $ANTLR start "rule__Visual__Group__4"
    // InternalDsl.g:2229:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2233:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalDsl.g:2234:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Visual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4"


    // $ANTLR start "rule__Visual__Group__4__Impl"
    // InternalDsl.g:2241:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__OriginAssignment_4 )? ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2245:1: ( ( ( rule__Visual__OriginAssignment_4 )? ) )
            // InternalDsl.g:2246:1: ( ( rule__Visual__OriginAssignment_4 )? )
            {
            // InternalDsl.g:2246:1: ( ( rule__Visual__OriginAssignment_4 )? )
            // InternalDsl.g:2247:2: ( rule__Visual__OriginAssignment_4 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_4()); 
            // InternalDsl.g:2248:2: ( rule__Visual__OriginAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2248:3: rule__Visual__OriginAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__OriginAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group__5"
    // InternalDsl.g:2256:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2260:1: ( rule__Visual__Group__5__Impl )
            // InternalDsl.g:2261:2: rule__Visual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5"


    // $ANTLR start "rule__Visual__Group__5__Impl"
    // InternalDsl.g:2267:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__Group_5__0 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2271:1: ( ( ( rule__Visual__Group_5__0 )? ) )
            // InternalDsl.g:2272:1: ( ( rule__Visual__Group_5__0 )? )
            {
            // InternalDsl.g:2272:1: ( ( rule__Visual__Group_5__0 )? )
            // InternalDsl.g:2273:2: ( rule__Visual__Group_5__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_5()); 
            // InternalDsl.g:2274:2: ( rule__Visual__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2274:3: rule__Visual__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5__Impl"


    // $ANTLR start "rule__Visual__Group_5__0"
    // InternalDsl.g:2283:1: rule__Visual__Group_5__0 : rule__Visual__Group_5__0__Impl rule__Visual__Group_5__1 ;
    public final void rule__Visual__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2287:1: ( rule__Visual__Group_5__0__Impl rule__Visual__Group_5__1 )
            // InternalDsl.g:2288:2: rule__Visual__Group_5__0__Impl rule__Visual__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Visual__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__0"


    // $ANTLR start "rule__Visual__Group_5__0__Impl"
    // InternalDsl.g:2295:1: rule__Visual__Group_5__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2299:1: ( ( 'Material' ) )
            // InternalDsl.g:2300:1: ( 'Material' )
            {
            // InternalDsl.g:2300:1: ( 'Material' )
            // InternalDsl.g:2301:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getMaterialKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__0__Impl"


    // $ANTLR start "rule__Visual__Group_5__1"
    // InternalDsl.g:2310:1: rule__Visual__Group_5__1 : rule__Visual__Group_5__1__Impl ;
    public final void rule__Visual__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2314:1: ( rule__Visual__Group_5__1__Impl )
            // InternalDsl.g:2315:2: rule__Visual__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__1"


    // $ANTLR start "rule__Visual__Group_5__1__Impl"
    // InternalDsl.g:2321:1: rule__Visual__Group_5__1__Impl : ( ( rule__Visual__MaterialAssignment_5_1 ) ) ;
    public final void rule__Visual__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2325:1: ( ( ( rule__Visual__MaterialAssignment_5_1 ) ) )
            // InternalDsl.g:2326:1: ( ( rule__Visual__MaterialAssignment_5_1 ) )
            {
            // InternalDsl.g:2326:1: ( ( rule__Visual__MaterialAssignment_5_1 ) )
            // InternalDsl.g:2327:2: ( rule__Visual__MaterialAssignment_5_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_5_1()); 
            // InternalDsl.g:2328:2: ( rule__Visual__MaterialAssignment_5_1 )
            // InternalDsl.g:2328:3: rule__Visual__MaterialAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__MaterialAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getMaterialAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__1__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalDsl.g:2337:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2341:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalDsl.g:2342:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalDsl.g:2349:1: rule__Collision__Group__0__Impl : ( ( rule__Collision__NameAssignment_0 ) ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2353:1: ( ( ( rule__Collision__NameAssignment_0 ) ) )
            // InternalDsl.g:2354:1: ( ( rule__Collision__NameAssignment_0 ) )
            {
            // InternalDsl.g:2354:1: ( ( rule__Collision__NameAssignment_0 ) )
            // InternalDsl.g:2355:2: ( rule__Collision__NameAssignment_0 )
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_0()); 
            // InternalDsl.g:2356:2: ( rule__Collision__NameAssignment_0 )
            // InternalDsl.g:2356:3: rule__Collision__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalDsl.g:2364:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2368:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalDsl.g:2369:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalDsl.g:2376:1: rule__Collision__Group__1__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2380:1: ( ( 'Geometry' ) )
            // InternalDsl.g:2381:1: ( 'Geometry' )
            {
            // InternalDsl.g:2381:1: ( 'Geometry' )
            // InternalDsl.g:2382:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalDsl.g:2391:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2395:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalDsl.g:2396:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalDsl.g:2403:1: rule__Collision__Group__2__Impl : ( ( rule__Collision__GeometryAssignment_2 ) ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2407:1: ( ( ( rule__Collision__GeometryAssignment_2 ) ) )
            // InternalDsl.g:2408:1: ( ( rule__Collision__GeometryAssignment_2 ) )
            {
            // InternalDsl.g:2408:1: ( ( rule__Collision__GeometryAssignment_2 ) )
            // InternalDsl.g:2409:2: ( rule__Collision__GeometryAssignment_2 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_2()); 
            // InternalDsl.g:2410:2: ( rule__Collision__GeometryAssignment_2 )
            // InternalDsl.g:2410:3: rule__Collision__GeometryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__3"
    // InternalDsl.g:2418:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2422:1: ( rule__Collision__Group__3__Impl )
            // InternalDsl.g:2423:2: rule__Collision__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalDsl.g:2429:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__Group_3__0 )? ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2433:1: ( ( ( rule__Collision__Group_3__0 )? ) )
            // InternalDsl.g:2434:1: ( ( rule__Collision__Group_3__0 )? )
            {
            // InternalDsl.g:2434:1: ( ( rule__Collision__Group_3__0 )? )
            // InternalDsl.g:2435:2: ( rule__Collision__Group_3__0 )?
            {
             before(grammarAccess.getCollisionAccess().getGroup_3()); 
            // InternalDsl.g:2436:2: ( rule__Collision__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2436:3: rule__Collision__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group_3__0"
    // InternalDsl.g:2445:1: rule__Collision__Group_3__0 : rule__Collision__Group_3__0__Impl rule__Collision__Group_3__1 ;
    public final void rule__Collision__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2449:1: ( rule__Collision__Group_3__0__Impl rule__Collision__Group_3__1 )
            // InternalDsl.g:2450:2: rule__Collision__Group_3__0__Impl rule__Collision__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Collision__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_3__0"


    // $ANTLR start "rule__Collision__Group_3__0__Impl"
    // InternalDsl.g:2457:1: rule__Collision__Group_3__0__Impl : ( 'Origin' ) ;
    public final void rule__Collision__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2461:1: ( ( 'Origin' ) )
            // InternalDsl.g:2462:1: ( 'Origin' )
            {
            // InternalDsl.g:2462:1: ( 'Origin' )
            // InternalDsl.g:2463:2: 'Origin'
            {
             before(grammarAccess.getCollisionAccess().getOriginKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getOriginKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_3__0__Impl"


    // $ANTLR start "rule__Collision__Group_3__1"
    // InternalDsl.g:2472:1: rule__Collision__Group_3__1 : rule__Collision__Group_3__1__Impl ;
    public final void rule__Collision__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2476:1: ( rule__Collision__Group_3__1__Impl )
            // InternalDsl.g:2477:2: rule__Collision__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_3__1"


    // $ANTLR start "rule__Collision__Group_3__1__Impl"
    // InternalDsl.g:2483:1: rule__Collision__Group_3__1__Impl : ( ( rule__Collision__OriginAssignment_3_1 ) ) ;
    public final void rule__Collision__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2487:1: ( ( ( rule__Collision__OriginAssignment_3_1 ) ) )
            // InternalDsl.g:2488:1: ( ( rule__Collision__OriginAssignment_3_1 ) )
            {
            // InternalDsl.g:2488:1: ( ( rule__Collision__OriginAssignment_3_1 ) )
            // InternalDsl.g:2489:2: ( rule__Collision__OriginAssignment_3_1 )
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_3_1()); 
            // InternalDsl.g:2490:2: ( rule__Collision__OriginAssignment_3_1 )
            // InternalDsl.g:2490:3: rule__Collision__OriginAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__OriginAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group_3__1__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalDsl.g:2499:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2503:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalDsl.g:2504:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalDsl.g:2511:1: rule__Origin__Group__0__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2515:1: ( ( 'Origin' ) )
            // InternalDsl.g:2516:1: ( 'Origin' )
            {
            // InternalDsl.g:2516:1: ( 'Origin' )
            // InternalDsl.g:2517:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalDsl.g:2526:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2530:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalDsl.g:2531:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalDsl.g:2538:1: rule__Origin__Group__1__Impl : ( ( rule__Origin__NameAssignment_1 )? ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2542:1: ( ( ( rule__Origin__NameAssignment_1 )? ) )
            // InternalDsl.g:2543:1: ( ( rule__Origin__NameAssignment_1 )? )
            {
            // InternalDsl.g:2543:1: ( ( rule__Origin__NameAssignment_1 )? )
            // InternalDsl.g:2544:2: ( rule__Origin__NameAssignment_1 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_1()); 
            // InternalDsl.g:2545:2: ( rule__Origin__NameAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:2545:3: rule__Origin__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalDsl.g:2553:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2557:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalDsl.g:2558:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Origin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalDsl.g:2565:1: rule__Origin__Group__2__Impl : ( 'xyz' ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2569:1: ( ( 'xyz' ) )
            // InternalDsl.g:2570:1: ( 'xyz' )
            {
            // InternalDsl.g:2570:1: ( 'xyz' )
            // InternalDsl.g:2571:2: 'xyz'
            {
             before(grammarAccess.getOriginAccess().getXyzKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXyzKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__3"
    // InternalDsl.g:2580:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2584:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalDsl.g:2585:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Origin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3"


    // $ANTLR start "rule__Origin__Group__3__Impl"
    // InternalDsl.g:2592:1: rule__Origin__Group__3__Impl : ( ( rule__Origin__XAssignment_3 ) ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2596:1: ( ( ( rule__Origin__XAssignment_3 ) ) )
            // InternalDsl.g:2597:1: ( ( rule__Origin__XAssignment_3 ) )
            {
            // InternalDsl.g:2597:1: ( ( rule__Origin__XAssignment_3 ) )
            // InternalDsl.g:2598:2: ( rule__Origin__XAssignment_3 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_3()); 
            // InternalDsl.g:2599:2: ( rule__Origin__XAssignment_3 )
            // InternalDsl.g:2599:3: rule__Origin__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Origin__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__4"
    // InternalDsl.g:2607:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2611:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalDsl.g:2612:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Origin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4"


    // $ANTLR start "rule__Origin__Group__4__Impl"
    // InternalDsl.g:2619:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__YAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2623:1: ( ( ( rule__Origin__YAssignment_4 ) ) )
            // InternalDsl.g:2624:1: ( ( rule__Origin__YAssignment_4 ) )
            {
            // InternalDsl.g:2624:1: ( ( rule__Origin__YAssignment_4 ) )
            // InternalDsl.g:2625:2: ( rule__Origin__YAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_4()); 
            // InternalDsl.g:2626:2: ( rule__Origin__YAssignment_4 )
            // InternalDsl.g:2626:3: rule__Origin__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__5"
    // InternalDsl.g:2634:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2638:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalDsl.g:2639:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Origin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5"


    // $ANTLR start "rule__Origin__Group__5__Impl"
    // InternalDsl.g:2646:1: rule__Origin__Group__5__Impl : ( ( rule__Origin__ZAssignment_5 ) ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2650:1: ( ( ( rule__Origin__ZAssignment_5 ) ) )
            // InternalDsl.g:2651:1: ( ( rule__Origin__ZAssignment_5 ) )
            {
            // InternalDsl.g:2651:1: ( ( rule__Origin__ZAssignment_5 ) )
            // InternalDsl.g:2652:2: ( rule__Origin__ZAssignment_5 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_5()); 
            // InternalDsl.g:2653:2: ( rule__Origin__ZAssignment_5 )
            // InternalDsl.g:2653:3: rule__Origin__ZAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Origin__ZAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getZAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5__Impl"


    // $ANTLR start "rule__Origin__Group__6"
    // InternalDsl.g:2661:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2665:1: ( rule__Origin__Group__6__Impl )
            // InternalDsl.g:2666:2: rule__Origin__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6"


    // $ANTLR start "rule__Origin__Group__6__Impl"
    // InternalDsl.g:2672:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__Group_6__0 )? ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2676:1: ( ( ( rule__Origin__Group_6__0 )? ) )
            // InternalDsl.g:2677:1: ( ( rule__Origin__Group_6__0 )? )
            {
            // InternalDsl.g:2677:1: ( ( rule__Origin__Group_6__0 )? )
            // InternalDsl.g:2678:2: ( rule__Origin__Group_6__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_6()); 
            // InternalDsl.g:2679:2: ( rule__Origin__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:2679:3: rule__Origin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6__Impl"


    // $ANTLR start "rule__Origin__Group_6__0"
    // InternalDsl.g:2688:1: rule__Origin__Group_6__0 : rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 ;
    public final void rule__Origin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2692:1: ( rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 )
            // InternalDsl.g:2693:2: rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1
            {
            pushFollow(FOLLOW_34);
            rule__Origin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__0"


    // $ANTLR start "rule__Origin__Group_6__0__Impl"
    // InternalDsl.g:2700:1: rule__Origin__Group_6__0__Impl : ( 'roll_pitch_yaw' ) ;
    public final void rule__Origin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2704:1: ( ( 'roll_pitch_yaw' ) )
            // InternalDsl.g:2705:1: ( 'roll_pitch_yaw' )
            {
            // InternalDsl.g:2705:1: ( 'roll_pitch_yaw' )
            // InternalDsl.g:2706:2: 'roll_pitch_yaw'
            {
             before(grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__0__Impl"


    // $ANTLR start "rule__Origin__Group_6__1"
    // InternalDsl.g:2715:1: rule__Origin__Group_6__1 : rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2 ;
    public final void rule__Origin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2719:1: ( rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2 )
            // InternalDsl.g:2720:2: rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2
            {
            pushFollow(FOLLOW_34);
            rule__Origin__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__1"


    // $ANTLR start "rule__Origin__Group_6__1__Impl"
    // InternalDsl.g:2727:1: rule__Origin__Group_6__1__Impl : ( ( rule__Origin__RollAssignment_6_1 ) ) ;
    public final void rule__Origin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2731:1: ( ( ( rule__Origin__RollAssignment_6_1 ) ) )
            // InternalDsl.g:2732:1: ( ( rule__Origin__RollAssignment_6_1 ) )
            {
            // InternalDsl.g:2732:1: ( ( rule__Origin__RollAssignment_6_1 ) )
            // InternalDsl.g:2733:2: ( rule__Origin__RollAssignment_6_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_6_1()); 
            // InternalDsl.g:2734:2: ( rule__Origin__RollAssignment_6_1 )
            // InternalDsl.g:2734:3: rule__Origin__RollAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__RollAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getRollAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__1__Impl"


    // $ANTLR start "rule__Origin__Group_6__2"
    // InternalDsl.g:2742:1: rule__Origin__Group_6__2 : rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3 ;
    public final void rule__Origin__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2746:1: ( rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3 )
            // InternalDsl.g:2747:2: rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3
            {
            pushFollow(FOLLOW_34);
            rule__Origin__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__2"


    // $ANTLR start "rule__Origin__Group_6__2__Impl"
    // InternalDsl.g:2754:1: rule__Origin__Group_6__2__Impl : ( ( rule__Origin__PitchAssignment_6_2 ) ) ;
    public final void rule__Origin__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2758:1: ( ( ( rule__Origin__PitchAssignment_6_2 ) ) )
            // InternalDsl.g:2759:1: ( ( rule__Origin__PitchAssignment_6_2 ) )
            {
            // InternalDsl.g:2759:1: ( ( rule__Origin__PitchAssignment_6_2 ) )
            // InternalDsl.g:2760:2: ( rule__Origin__PitchAssignment_6_2 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_6_2()); 
            // InternalDsl.g:2761:2: ( rule__Origin__PitchAssignment_6_2 )
            // InternalDsl.g:2761:3: rule__Origin__PitchAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Origin__PitchAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__2__Impl"


    // $ANTLR start "rule__Origin__Group_6__3"
    // InternalDsl.g:2769:1: rule__Origin__Group_6__3 : rule__Origin__Group_6__3__Impl ;
    public final void rule__Origin__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2773:1: ( rule__Origin__Group_6__3__Impl )
            // InternalDsl.g:2774:2: rule__Origin__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__3"


    // $ANTLR start "rule__Origin__Group_6__3__Impl"
    // InternalDsl.g:2780:1: rule__Origin__Group_6__3__Impl : ( ( rule__Origin__YawAssignment_6_3 ) ) ;
    public final void rule__Origin__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2784:1: ( ( ( rule__Origin__YawAssignment_6_3 ) ) )
            // InternalDsl.g:2785:1: ( ( rule__Origin__YawAssignment_6_3 ) )
            {
            // InternalDsl.g:2785:1: ( ( rule__Origin__YawAssignment_6_3 ) )
            // InternalDsl.g:2786:2: ( rule__Origin__YawAssignment_6_3 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_6_3()); 
            // InternalDsl.g:2787:2: ( rule__Origin__YawAssignment_6_3 )
            // InternalDsl.g:2787:3: rule__Origin__YawAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YawAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYawAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__3__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalDsl.g:2796:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2800:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalDsl.g:2801:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalDsl.g:2808:1: rule__Mass__Group__0__Impl : ( ( rule__Mass__NameAssignment_0 )? ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2812:1: ( ( ( rule__Mass__NameAssignment_0 )? ) )
            // InternalDsl.g:2813:1: ( ( rule__Mass__NameAssignment_0 )? )
            {
            // InternalDsl.g:2813:1: ( ( rule__Mass__NameAssignment_0 )? )
            // InternalDsl.g:2814:2: ( rule__Mass__NameAssignment_0 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_0()); 
            // InternalDsl.g:2815:2: ( rule__Mass__NameAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:2815:3: rule__Mass__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalDsl.g:2823:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2827:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalDsl.g:2828:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalDsl.g:2835:1: rule__Mass__Group__1__Impl : ( 'massValueInKilograms' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2839:1: ( ( 'massValueInKilograms' ) )
            // InternalDsl.g:2840:1: ( 'massValueInKilograms' )
            {
            // InternalDsl.g:2840:1: ( 'massValueInKilograms' )
            // InternalDsl.g:2841:2: 'massValueInKilograms'
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalDsl.g:2850:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2854:1: ( rule__Mass__Group__2__Impl )
            // InternalDsl.g:2855:2: rule__Mass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalDsl.g:2861:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__MassValueInKilogramsAssignment_2 ) ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2865:1: ( ( ( rule__Mass__MassValueInKilogramsAssignment_2 ) ) )
            // InternalDsl.g:2866:1: ( ( rule__Mass__MassValueInKilogramsAssignment_2 ) )
            {
            // InternalDsl.g:2866:1: ( ( rule__Mass__MassValueInKilogramsAssignment_2 ) )
            // InternalDsl.g:2867:2: ( rule__Mass__MassValueInKilogramsAssignment_2 )
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_2()); 
            // InternalDsl.g:2868:2: ( rule__Mass__MassValueInKilogramsAssignment_2 )
            // InternalDsl.g:2868:3: rule__Mass__MassValueInKilogramsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mass__MassValueInKilogramsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalDsl.g:2877:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2881:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalDsl.g:2882:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalDsl.g:2889:1: rule__Inertia__Group__0__Impl : ( ( rule__Inertia__NameAssignment_0 )? ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2893:1: ( ( ( rule__Inertia__NameAssignment_0 )? ) )
            // InternalDsl.g:2894:1: ( ( rule__Inertia__NameAssignment_0 )? )
            {
            // InternalDsl.g:2894:1: ( ( rule__Inertia__NameAssignment_0 )? )
            // InternalDsl.g:2895:2: ( rule__Inertia__NameAssignment_0 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_0()); 
            // InternalDsl.g:2896:2: ( rule__Inertia__NameAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:2896:3: rule__Inertia__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalDsl.g:2904:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2908:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalDsl.g:2909:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalDsl.g:2916:1: rule__Inertia__Group__1__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2920:1: ( ( 'ixx' ) )
            // InternalDsl.g:2921:1: ( 'ixx' )
            {
            // InternalDsl.g:2921:1: ( 'ixx' )
            // InternalDsl.g:2922:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__2"
    // InternalDsl.g:2931:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2935:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalDsl.g:2936:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Inertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2"


    // $ANTLR start "rule__Inertia__Group__2__Impl"
    // InternalDsl.g:2943:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__IxxAssignment_2 ) ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2947:1: ( ( ( rule__Inertia__IxxAssignment_2 ) ) )
            // InternalDsl.g:2948:1: ( ( rule__Inertia__IxxAssignment_2 ) )
            {
            // InternalDsl.g:2948:1: ( ( rule__Inertia__IxxAssignment_2 ) )
            // InternalDsl.g:2949:2: ( rule__Inertia__IxxAssignment_2 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_2()); 
            // InternalDsl.g:2950:2: ( rule__Inertia__IxxAssignment_2 )
            // InternalDsl.g:2950:3: rule__Inertia__IxxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__3"
    // InternalDsl.g:2958:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2962:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalDsl.g:2963:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3"


    // $ANTLR start "rule__Inertia__Group__3__Impl"
    // InternalDsl.g:2970:1: rule__Inertia__Group__3__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2974:1: ( ( 'ixy' ) )
            // InternalDsl.g:2975:1: ( 'ixy' )
            {
            // InternalDsl.g:2975:1: ( 'ixy' )
            // InternalDsl.g:2976:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__4"
    // InternalDsl.g:2985:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2989:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalDsl.g:2990:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Inertia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4"


    // $ANTLR start "rule__Inertia__Group__4__Impl"
    // InternalDsl.g:2997:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__IxyAssignment_4 ) ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3001:1: ( ( ( rule__Inertia__IxyAssignment_4 ) ) )
            // InternalDsl.g:3002:1: ( ( rule__Inertia__IxyAssignment_4 ) )
            {
            // InternalDsl.g:3002:1: ( ( rule__Inertia__IxyAssignment_4 ) )
            // InternalDsl.g:3003:2: ( rule__Inertia__IxyAssignment_4 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_4()); 
            // InternalDsl.g:3004:2: ( rule__Inertia__IxyAssignment_4 )
            // InternalDsl.g:3004:3: rule__Inertia__IxyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__5"
    // InternalDsl.g:3012:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3016:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalDsl.g:3017:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5"


    // $ANTLR start "rule__Inertia__Group__5__Impl"
    // InternalDsl.g:3024:1: rule__Inertia__Group__5__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3028:1: ( ( 'ixz' ) )
            // InternalDsl.g:3029:1: ( 'ixz' )
            {
            // InternalDsl.g:3029:1: ( 'ixz' )
            // InternalDsl.g:3030:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__6"
    // InternalDsl.g:3039:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3043:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalDsl.g:3044:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Inertia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6"


    // $ANTLR start "rule__Inertia__Group__6__Impl"
    // InternalDsl.g:3051:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__IxzAssignment_6 ) ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3055:1: ( ( ( rule__Inertia__IxzAssignment_6 ) ) )
            // InternalDsl.g:3056:1: ( ( rule__Inertia__IxzAssignment_6 ) )
            {
            // InternalDsl.g:3056:1: ( ( rule__Inertia__IxzAssignment_6 ) )
            // InternalDsl.g:3057:2: ( rule__Inertia__IxzAssignment_6 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_6()); 
            // InternalDsl.g:3058:2: ( rule__Inertia__IxzAssignment_6 )
            // InternalDsl.g:3058:3: rule__Inertia__IxzAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6__Impl"


    // $ANTLR start "rule__Inertia__Group__7"
    // InternalDsl.g:3066:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3070:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalDsl.g:3071:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7"


    // $ANTLR start "rule__Inertia__Group__7__Impl"
    // InternalDsl.g:3078:1: rule__Inertia__Group__7__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3082:1: ( ( 'iyy' ) )
            // InternalDsl.g:3083:1: ( 'iyy' )
            {
            // InternalDsl.g:3083:1: ( 'iyy' )
            // InternalDsl.g:3084:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7__Impl"


    // $ANTLR start "rule__Inertia__Group__8"
    // InternalDsl.g:3093:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3097:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalDsl.g:3098:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__Inertia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8"


    // $ANTLR start "rule__Inertia__Group__8__Impl"
    // InternalDsl.g:3105:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__IyyAssignment_8 ) ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3109:1: ( ( ( rule__Inertia__IyyAssignment_8 ) ) )
            // InternalDsl.g:3110:1: ( ( rule__Inertia__IyyAssignment_8 ) )
            {
            // InternalDsl.g:3110:1: ( ( rule__Inertia__IyyAssignment_8 ) )
            // InternalDsl.g:3111:2: ( rule__Inertia__IyyAssignment_8 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_8()); 
            // InternalDsl.g:3112:2: ( rule__Inertia__IyyAssignment_8 )
            // InternalDsl.g:3112:3: rule__Inertia__IyyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8__Impl"


    // $ANTLR start "rule__Inertia__Group__9"
    // InternalDsl.g:3120:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3124:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalDsl.g:3125:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9"


    // $ANTLR start "rule__Inertia__Group__9__Impl"
    // InternalDsl.g:3132:1: rule__Inertia__Group__9__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3136:1: ( ( 'iyz' ) )
            // InternalDsl.g:3137:1: ( 'iyz' )
            {
            // InternalDsl.g:3137:1: ( 'iyz' )
            // InternalDsl.g:3138:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9__Impl"


    // $ANTLR start "rule__Inertia__Group__10"
    // InternalDsl.g:3147:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3151:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalDsl.g:3152:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_40);
            rule__Inertia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__10"


    // $ANTLR start "rule__Inertia__Group__10__Impl"
    // InternalDsl.g:3159:1: rule__Inertia__Group__10__Impl : ( ( rule__Inertia__IyzAssignment_10 ) ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3163:1: ( ( ( rule__Inertia__IyzAssignment_10 ) ) )
            // InternalDsl.g:3164:1: ( ( rule__Inertia__IyzAssignment_10 ) )
            {
            // InternalDsl.g:3164:1: ( ( rule__Inertia__IyzAssignment_10 ) )
            // InternalDsl.g:3165:2: ( rule__Inertia__IyzAssignment_10 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_10()); 
            // InternalDsl.g:3166:2: ( rule__Inertia__IyzAssignment_10 )
            // InternalDsl.g:3166:3: rule__Inertia__IyzAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__10__Impl"


    // $ANTLR start "rule__Inertia__Group__11"
    // InternalDsl.g:3174:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3178:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalDsl.g:3179:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__11"


    // $ANTLR start "rule__Inertia__Group__11__Impl"
    // InternalDsl.g:3186:1: rule__Inertia__Group__11__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3190:1: ( ( 'izz' ) )
            // InternalDsl.g:3191:1: ( 'izz' )
            {
            // InternalDsl.g:3191:1: ( 'izz' )
            // InternalDsl.g:3192:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_11()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__11__Impl"


    // $ANTLR start "rule__Inertia__Group__12"
    // InternalDsl.g:3201:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3205:1: ( rule__Inertia__Group__12__Impl )
            // InternalDsl.g:3206:2: rule__Inertia__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__12"


    // $ANTLR start "rule__Inertia__Group__12__Impl"
    // InternalDsl.g:3212:1: rule__Inertia__Group__12__Impl : ( ( rule__Inertia__IzzAssignment_12 ) ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3216:1: ( ( ( rule__Inertia__IzzAssignment_12 ) ) )
            // InternalDsl.g:3217:1: ( ( rule__Inertia__IzzAssignment_12 ) )
            {
            // InternalDsl.g:3217:1: ( ( rule__Inertia__IzzAssignment_12 ) )
            // InternalDsl.g:3218:2: ( rule__Inertia__IzzAssignment_12 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_12()); 
            // InternalDsl.g:3219:2: ( rule__Inertia__IzzAssignment_12 )
            // InternalDsl.g:3219:3: rule__Inertia__IzzAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__12__Impl"


    // $ANTLR start "rule__Color__Group_0__0"
    // InternalDsl.g:3228:1: rule__Color__Group_0__0 : rule__Color__Group_0__0__Impl rule__Color__Group_0__1 ;
    public final void rule__Color__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3232:1: ( rule__Color__Group_0__0__Impl rule__Color__Group_0__1 )
            // InternalDsl.g:3233:2: rule__Color__Group_0__0__Impl rule__Color__Group_0__1
            {
            pushFollow(FOLLOW_41);
            rule__Color__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__0"


    // $ANTLR start "rule__Color__Group_0__0__Impl"
    // InternalDsl.g:3240:1: rule__Color__Group_0__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3244:1: ( ( 'Color' ) )
            // InternalDsl.g:3245:1: ( 'Color' )
            {
            // InternalDsl.g:3245:1: ( 'Color' )
            // InternalDsl.g:3246:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__0__Impl"


    // $ANTLR start "rule__Color__Group_0__1"
    // InternalDsl.g:3255:1: rule__Color__Group_0__1 : rule__Color__Group_0__1__Impl rule__Color__Group_0__2 ;
    public final void rule__Color__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3259:1: ( rule__Color__Group_0__1__Impl rule__Color__Group_0__2 )
            // InternalDsl.g:3260:2: rule__Color__Group_0__1__Impl rule__Color__Group_0__2
            {
            pushFollow(FOLLOW_41);
            rule__Color__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__1"


    // $ANTLR start "rule__Color__Group_0__1__Impl"
    // InternalDsl.g:3267:1: rule__Color__Group_0__1__Impl : ( ( rule__Color__NameAssignment_0_1 )? ) ;
    public final void rule__Color__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3271:1: ( ( ( rule__Color__NameAssignment_0_1 )? ) )
            // InternalDsl.g:3272:1: ( ( rule__Color__NameAssignment_0_1 )? )
            {
            // InternalDsl.g:3272:1: ( ( rule__Color__NameAssignment_0_1 )? )
            // InternalDsl.g:3273:2: ( rule__Color__NameAssignment_0_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_0_1()); 
            // InternalDsl.g:3274:2: ( rule__Color__NameAssignment_0_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3274:3: rule__Color__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__NameAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__1__Impl"


    // $ANTLR start "rule__Color__Group_0__2"
    // InternalDsl.g:3282:1: rule__Color__Group_0__2 : rule__Color__Group_0__2__Impl rule__Color__Group_0__3 ;
    public final void rule__Color__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3286:1: ( rule__Color__Group_0__2__Impl rule__Color__Group_0__3 )
            // InternalDsl.g:3287:2: rule__Color__Group_0__2__Impl rule__Color__Group_0__3
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__2"


    // $ANTLR start "rule__Color__Group_0__2__Impl"
    // InternalDsl.g:3294:1: rule__Color__Group_0__2__Impl : ( 'red_green_blue_alpha' ) ;
    public final void rule__Color__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3298:1: ( ( 'red_green_blue_alpha' ) )
            // InternalDsl.g:3299:1: ( 'red_green_blue_alpha' )
            {
            // InternalDsl.g:3299:1: ( 'red_green_blue_alpha' )
            // InternalDsl.g:3300:2: 'red_green_blue_alpha'
            {
             before(grammarAccess.getColorAccess().getRed_green_blue_alphaKeyword_0_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRed_green_blue_alphaKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__2__Impl"


    // $ANTLR start "rule__Color__Group_0__3"
    // InternalDsl.g:3309:1: rule__Color__Group_0__3 : rule__Color__Group_0__3__Impl rule__Color__Group_0__4 ;
    public final void rule__Color__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3313:1: ( rule__Color__Group_0__3__Impl rule__Color__Group_0__4 )
            // InternalDsl.g:3314:2: rule__Color__Group_0__3__Impl rule__Color__Group_0__4
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__3"


    // $ANTLR start "rule__Color__Group_0__3__Impl"
    // InternalDsl.g:3321:1: rule__Color__Group_0__3__Impl : ( ( rule__Color__RedAssignment_0_3 ) ) ;
    public final void rule__Color__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3325:1: ( ( ( rule__Color__RedAssignment_0_3 ) ) )
            // InternalDsl.g:3326:1: ( ( rule__Color__RedAssignment_0_3 ) )
            {
            // InternalDsl.g:3326:1: ( ( rule__Color__RedAssignment_0_3 ) )
            // InternalDsl.g:3327:2: ( rule__Color__RedAssignment_0_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_0_3()); 
            // InternalDsl.g:3328:2: ( rule__Color__RedAssignment_0_3 )
            // InternalDsl.g:3328:3: rule__Color__RedAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__3__Impl"


    // $ANTLR start "rule__Color__Group_0__4"
    // InternalDsl.g:3336:1: rule__Color__Group_0__4 : rule__Color__Group_0__4__Impl rule__Color__Group_0__5 ;
    public final void rule__Color__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3340:1: ( rule__Color__Group_0__4__Impl rule__Color__Group_0__5 )
            // InternalDsl.g:3341:2: rule__Color__Group_0__4__Impl rule__Color__Group_0__5
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__4"


    // $ANTLR start "rule__Color__Group_0__4__Impl"
    // InternalDsl.g:3348:1: rule__Color__Group_0__4__Impl : ( ( rule__Color__GreenAssignment_0_4 ) ) ;
    public final void rule__Color__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3352:1: ( ( ( rule__Color__GreenAssignment_0_4 ) ) )
            // InternalDsl.g:3353:1: ( ( rule__Color__GreenAssignment_0_4 ) )
            {
            // InternalDsl.g:3353:1: ( ( rule__Color__GreenAssignment_0_4 ) )
            // InternalDsl.g:3354:2: ( rule__Color__GreenAssignment_0_4 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_0_4()); 
            // InternalDsl.g:3355:2: ( rule__Color__GreenAssignment_0_4 )
            // InternalDsl.g:3355:3: rule__Color__GreenAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__4__Impl"


    // $ANTLR start "rule__Color__Group_0__5"
    // InternalDsl.g:3363:1: rule__Color__Group_0__5 : rule__Color__Group_0__5__Impl rule__Color__Group_0__6 ;
    public final void rule__Color__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3367:1: ( rule__Color__Group_0__5__Impl rule__Color__Group_0__6 )
            // InternalDsl.g:3368:2: rule__Color__Group_0__5__Impl rule__Color__Group_0__6
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__5"


    // $ANTLR start "rule__Color__Group_0__5__Impl"
    // InternalDsl.g:3375:1: rule__Color__Group_0__5__Impl : ( ( rule__Color__BlueAssignment_0_5 ) ) ;
    public final void rule__Color__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3379:1: ( ( ( rule__Color__BlueAssignment_0_5 ) ) )
            // InternalDsl.g:3380:1: ( ( rule__Color__BlueAssignment_0_5 ) )
            {
            // InternalDsl.g:3380:1: ( ( rule__Color__BlueAssignment_0_5 ) )
            // InternalDsl.g:3381:2: ( rule__Color__BlueAssignment_0_5 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_0_5()); 
            // InternalDsl.g:3382:2: ( rule__Color__BlueAssignment_0_5 )
            // InternalDsl.g:3382:3: rule__Color__BlueAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__5__Impl"


    // $ANTLR start "rule__Color__Group_0__6"
    // InternalDsl.g:3390:1: rule__Color__Group_0__6 : rule__Color__Group_0__6__Impl ;
    public final void rule__Color__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3394:1: ( rule__Color__Group_0__6__Impl )
            // InternalDsl.g:3395:2: rule__Color__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__6"


    // $ANTLR start "rule__Color__Group_0__6__Impl"
    // InternalDsl.g:3401:1: rule__Color__Group_0__6__Impl : ( ( rule__Color__AlphaAssignment_0_6 ) ) ;
    public final void rule__Color__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3405:1: ( ( ( rule__Color__AlphaAssignment_0_6 ) ) )
            // InternalDsl.g:3406:1: ( ( rule__Color__AlphaAssignment_0_6 ) )
            {
            // InternalDsl.g:3406:1: ( ( rule__Color__AlphaAssignment_0_6 ) )
            // InternalDsl.g:3407:2: ( rule__Color__AlphaAssignment_0_6 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_0_6()); 
            // InternalDsl.g:3408:2: ( rule__Color__AlphaAssignment_0_6 )
            // InternalDsl.g:3408:3: rule__Color__AlphaAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Color__AlphaAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__6__Impl"


    // $ANTLR start "rule__Color__Group_1__0"
    // InternalDsl.g:3417:1: rule__Color__Group_1__0 : rule__Color__Group_1__0__Impl rule__Color__Group_1__1 ;
    public final void rule__Color__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3421:1: ( rule__Color__Group_1__0__Impl rule__Color__Group_1__1 )
            // InternalDsl.g:3422:2: rule__Color__Group_1__0__Impl rule__Color__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__0"


    // $ANTLR start "rule__Color__Group_1__0__Impl"
    // InternalDsl.g:3429:1: rule__Color__Group_1__0__Impl : ( 'red' ) ;
    public final void rule__Color__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3433:1: ( ( 'red' ) )
            // InternalDsl.g:3434:1: ( 'red' )
            {
            // InternalDsl.g:3434:1: ( 'red' )
            // InternalDsl.g:3435:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__0__Impl"


    // $ANTLR start "rule__Color__Group_1__1"
    // InternalDsl.g:3444:1: rule__Color__Group_1__1 : rule__Color__Group_1__1__Impl rule__Color__Group_1__2 ;
    public final void rule__Color__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3448:1: ( rule__Color__Group_1__1__Impl rule__Color__Group_1__2 )
            // InternalDsl.g:3449:2: rule__Color__Group_1__1__Impl rule__Color__Group_1__2
            {
            pushFollow(FOLLOW_42);
            rule__Color__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__1"


    // $ANTLR start "rule__Color__Group_1__1__Impl"
    // InternalDsl.g:3456:1: rule__Color__Group_1__1__Impl : ( ( rule__Color__RedAssignment_1_1 ) ) ;
    public final void rule__Color__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3460:1: ( ( ( rule__Color__RedAssignment_1_1 ) ) )
            // InternalDsl.g:3461:1: ( ( rule__Color__RedAssignment_1_1 ) )
            {
            // InternalDsl.g:3461:1: ( ( rule__Color__RedAssignment_1_1 ) )
            // InternalDsl.g:3462:2: ( rule__Color__RedAssignment_1_1 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_1_1()); 
            // InternalDsl.g:3463:2: ( rule__Color__RedAssignment_1_1 )
            // InternalDsl.g:3463:3: rule__Color__RedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__1__Impl"


    // $ANTLR start "rule__Color__Group_1__2"
    // InternalDsl.g:3471:1: rule__Color__Group_1__2 : rule__Color__Group_1__2__Impl rule__Color__Group_1__3 ;
    public final void rule__Color__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3475:1: ( rule__Color__Group_1__2__Impl rule__Color__Group_1__3 )
            // InternalDsl.g:3476:2: rule__Color__Group_1__2__Impl rule__Color__Group_1__3
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__2"


    // $ANTLR start "rule__Color__Group_1__2__Impl"
    // InternalDsl.g:3483:1: rule__Color__Group_1__2__Impl : ( 'green' ) ;
    public final void rule__Color__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3487:1: ( ( 'green' ) )
            // InternalDsl.g:3488:1: ( 'green' )
            {
            // InternalDsl.g:3488:1: ( 'green' )
            // InternalDsl.g:3489:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_1_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGreenKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__2__Impl"


    // $ANTLR start "rule__Color__Group_1__3"
    // InternalDsl.g:3498:1: rule__Color__Group_1__3 : rule__Color__Group_1__3__Impl rule__Color__Group_1__4 ;
    public final void rule__Color__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3502:1: ( rule__Color__Group_1__3__Impl rule__Color__Group_1__4 )
            // InternalDsl.g:3503:2: rule__Color__Group_1__3__Impl rule__Color__Group_1__4
            {
            pushFollow(FOLLOW_43);
            rule__Color__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__3"


    // $ANTLR start "rule__Color__Group_1__3__Impl"
    // InternalDsl.g:3510:1: rule__Color__Group_1__3__Impl : ( ( rule__Color__GreenAssignment_1_3 ) ) ;
    public final void rule__Color__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3514:1: ( ( ( rule__Color__GreenAssignment_1_3 ) ) )
            // InternalDsl.g:3515:1: ( ( rule__Color__GreenAssignment_1_3 ) )
            {
            // InternalDsl.g:3515:1: ( ( rule__Color__GreenAssignment_1_3 ) )
            // InternalDsl.g:3516:2: ( rule__Color__GreenAssignment_1_3 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_1_3()); 
            // InternalDsl.g:3517:2: ( rule__Color__GreenAssignment_1_3 )
            // InternalDsl.g:3517:3: rule__Color__GreenAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__3__Impl"


    // $ANTLR start "rule__Color__Group_1__4"
    // InternalDsl.g:3525:1: rule__Color__Group_1__4 : rule__Color__Group_1__4__Impl rule__Color__Group_1__5 ;
    public final void rule__Color__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3529:1: ( rule__Color__Group_1__4__Impl rule__Color__Group_1__5 )
            // InternalDsl.g:3530:2: rule__Color__Group_1__4__Impl rule__Color__Group_1__5
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__4"


    // $ANTLR start "rule__Color__Group_1__4__Impl"
    // InternalDsl.g:3537:1: rule__Color__Group_1__4__Impl : ( 'blue' ) ;
    public final void rule__Color__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3541:1: ( ( 'blue' ) )
            // InternalDsl.g:3542:1: ( 'blue' )
            {
            // InternalDsl.g:3542:1: ( 'blue' )
            // InternalDsl.g:3543:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_1_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBlueKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__4__Impl"


    // $ANTLR start "rule__Color__Group_1__5"
    // InternalDsl.g:3552:1: rule__Color__Group_1__5 : rule__Color__Group_1__5__Impl rule__Color__Group_1__6 ;
    public final void rule__Color__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3556:1: ( rule__Color__Group_1__5__Impl rule__Color__Group_1__6 )
            // InternalDsl.g:3557:2: rule__Color__Group_1__5__Impl rule__Color__Group_1__6
            {
            pushFollow(FOLLOW_44);
            rule__Color__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__5"


    // $ANTLR start "rule__Color__Group_1__5__Impl"
    // InternalDsl.g:3564:1: rule__Color__Group_1__5__Impl : ( ( rule__Color__BlueAssignment_1_5 ) ) ;
    public final void rule__Color__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3568:1: ( ( ( rule__Color__BlueAssignment_1_5 ) ) )
            // InternalDsl.g:3569:1: ( ( rule__Color__BlueAssignment_1_5 ) )
            {
            // InternalDsl.g:3569:1: ( ( rule__Color__BlueAssignment_1_5 ) )
            // InternalDsl.g:3570:2: ( rule__Color__BlueAssignment_1_5 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_1_5()); 
            // InternalDsl.g:3571:2: ( rule__Color__BlueAssignment_1_5 )
            // InternalDsl.g:3571:3: rule__Color__BlueAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__5__Impl"


    // $ANTLR start "rule__Color__Group_1__6"
    // InternalDsl.g:3579:1: rule__Color__Group_1__6 : rule__Color__Group_1__6__Impl rule__Color__Group_1__7 ;
    public final void rule__Color__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3583:1: ( rule__Color__Group_1__6__Impl rule__Color__Group_1__7 )
            // InternalDsl.g:3584:2: rule__Color__Group_1__6__Impl rule__Color__Group_1__7
            {
            pushFollow(FOLLOW_34);
            rule__Color__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__6"


    // $ANTLR start "rule__Color__Group_1__6__Impl"
    // InternalDsl.g:3591:1: rule__Color__Group_1__6__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3595:1: ( ( 'alpha' ) )
            // InternalDsl.g:3596:1: ( 'alpha' )
            {
            // InternalDsl.g:3596:1: ( 'alpha' )
            // InternalDsl.g:3597:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_1_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getAlphaKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__6__Impl"


    // $ANTLR start "rule__Color__Group_1__7"
    // InternalDsl.g:3606:1: rule__Color__Group_1__7 : rule__Color__Group_1__7__Impl ;
    public final void rule__Color__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3610:1: ( rule__Color__Group_1__7__Impl )
            // InternalDsl.g:3611:2: rule__Color__Group_1__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group_1__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__7"


    // $ANTLR start "rule__Color__Group_1__7__Impl"
    // InternalDsl.g:3617:1: rule__Color__Group_1__7__Impl : ( ( rule__Color__AlphaAssignment_1_7 ) ) ;
    public final void rule__Color__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3621:1: ( ( ( rule__Color__AlphaAssignment_1_7 ) ) )
            // InternalDsl.g:3622:1: ( ( rule__Color__AlphaAssignment_1_7 ) )
            {
            // InternalDsl.g:3622:1: ( ( rule__Color__AlphaAssignment_1_7 ) )
            // InternalDsl.g:3623:2: ( rule__Color__AlphaAssignment_1_7 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_1_7()); 
            // InternalDsl.g:3624:2: ( rule__Color__AlphaAssignment_1_7 )
            // InternalDsl.g:3624:3: rule__Color__AlphaAssignment_1_7
            {
            pushFollow(FOLLOW_2);
            rule__Color__AlphaAssignment_1_7();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_1__7__Impl"


    // $ANTLR start "rule__Texture__Group__0"
    // InternalDsl.g:3633:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3637:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalDsl.g:3638:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Texture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0"


    // $ANTLR start "rule__Texture__Group__0__Impl"
    // InternalDsl.g:3645:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3649:1: ( ( 'Texture' ) )
            // InternalDsl.g:3650:1: ( 'Texture' )
            {
            // InternalDsl.g:3650:1: ( 'Texture' )
            // InternalDsl.g:3651:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getTextureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalDsl.g:3660:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3664:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalDsl.g:3665:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Texture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1"


    // $ANTLR start "rule__Texture__Group__1__Impl"
    // InternalDsl.g:3672:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3676:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalDsl.g:3677:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalDsl.g:3677:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalDsl.g:3678:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalDsl.g:3679:2: ( rule__Texture__NameAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3679:3: rule__Texture__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Texture__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1__Impl"


    // $ANTLR start "rule__Texture__Group__2"
    // InternalDsl.g:3687:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3691:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalDsl.g:3692:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Texture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2"


    // $ANTLR start "rule__Texture__Group__2__Impl"
    // InternalDsl.g:3699:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3703:1: ( ( 'pathToFile' ) )
            // InternalDsl.g:3704:1: ( 'pathToFile' )
            {
            // InternalDsl.g:3704:1: ( 'pathToFile' )
            // InternalDsl.g:3705:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2__Impl"


    // $ANTLR start "rule__Texture__Group__3"
    // InternalDsl.g:3714:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3718:1: ( rule__Texture__Group__3__Impl )
            // InternalDsl.g:3719:2: rule__Texture__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__3"


    // $ANTLR start "rule__Texture__Group__3__Impl"
    // InternalDsl.g:3725:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3729:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalDsl.g:3730:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalDsl.g:3730:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalDsl.g:3731:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalDsl.g:3732:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalDsl.g:3732:3: rule__Texture__PathToFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Texture__PathToFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__3__Impl"


    // $ANTLR start "rule__Box__Group_0__0"
    // InternalDsl.g:3741:1: rule__Box__Group_0__0 : rule__Box__Group_0__0__Impl rule__Box__Group_0__1 ;
    public final void rule__Box__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3745:1: ( rule__Box__Group_0__0__Impl rule__Box__Group_0__1 )
            // InternalDsl.g:3746:2: rule__Box__Group_0__0__Impl rule__Box__Group_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Box__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__0"


    // $ANTLR start "rule__Box__Group_0__0__Impl"
    // InternalDsl.g:3753:1: rule__Box__Group_0__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3757:1: ( ( 'Box' ) )
            // InternalDsl.g:3758:1: ( 'Box' )
            {
            // InternalDsl.g:3758:1: ( 'Box' )
            // InternalDsl.g:3759:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__0__Impl"


    // $ANTLR start "rule__Box__Group_0__1"
    // InternalDsl.g:3768:1: rule__Box__Group_0__1 : rule__Box__Group_0__1__Impl rule__Box__Group_0__2 ;
    public final void rule__Box__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3772:1: ( rule__Box__Group_0__1__Impl rule__Box__Group_0__2 )
            // InternalDsl.g:3773:2: rule__Box__Group_0__1__Impl rule__Box__Group_0__2
            {
            pushFollow(FOLLOW_47);
            rule__Box__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__1"


    // $ANTLR start "rule__Box__Group_0__1__Impl"
    // InternalDsl.g:3780:1: rule__Box__Group_0__1__Impl : ( ( rule__Box__NameAssignment_0_1 )? ) ;
    public final void rule__Box__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3784:1: ( ( ( rule__Box__NameAssignment_0_1 )? ) )
            // InternalDsl.g:3785:1: ( ( rule__Box__NameAssignment_0_1 )? )
            {
            // InternalDsl.g:3785:1: ( ( rule__Box__NameAssignment_0_1 )? )
            // InternalDsl.g:3786:2: ( rule__Box__NameAssignment_0_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_0_1()); 
            // InternalDsl.g:3787:2: ( rule__Box__NameAssignment_0_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:3787:3: rule__Box__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__NameAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__1__Impl"


    // $ANTLR start "rule__Box__Group_0__2"
    // InternalDsl.g:3795:1: rule__Box__Group_0__2 : rule__Box__Group_0__2__Impl rule__Box__Group_0__3 ;
    public final void rule__Box__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3799:1: ( rule__Box__Group_0__2__Impl rule__Box__Group_0__3 )
            // InternalDsl.g:3800:2: rule__Box__Group_0__2__Impl rule__Box__Group_0__3
            {
            pushFollow(FOLLOW_34);
            rule__Box__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__2"


    // $ANTLR start "rule__Box__Group_0__2__Impl"
    // InternalDsl.g:3807:1: rule__Box__Group_0__2__Impl : ( 'height_length_width' ) ;
    public final void rule__Box__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3811:1: ( ( 'height_length_width' ) )
            // InternalDsl.g:3812:1: ( 'height_length_width' )
            {
            // InternalDsl.g:3812:1: ( 'height_length_width' )
            // InternalDsl.g:3813:2: 'height_length_width'
            {
             before(grammarAccess.getBoxAccess().getHeight_length_widthKeyword_0_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getHeight_length_widthKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__2__Impl"


    // $ANTLR start "rule__Box__Group_0__3"
    // InternalDsl.g:3822:1: rule__Box__Group_0__3 : rule__Box__Group_0__3__Impl rule__Box__Group_0__4 ;
    public final void rule__Box__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3826:1: ( rule__Box__Group_0__3__Impl rule__Box__Group_0__4 )
            // InternalDsl.g:3827:2: rule__Box__Group_0__3__Impl rule__Box__Group_0__4
            {
            pushFollow(FOLLOW_34);
            rule__Box__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__3"


    // $ANTLR start "rule__Box__Group_0__3__Impl"
    // InternalDsl.g:3834:1: rule__Box__Group_0__3__Impl : ( ( rule__Box__HeightAssignment_0_3 ) ) ;
    public final void rule__Box__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3838:1: ( ( ( rule__Box__HeightAssignment_0_3 ) ) )
            // InternalDsl.g:3839:1: ( ( rule__Box__HeightAssignment_0_3 ) )
            {
            // InternalDsl.g:3839:1: ( ( rule__Box__HeightAssignment_0_3 ) )
            // InternalDsl.g:3840:2: ( rule__Box__HeightAssignment_0_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_0_3()); 
            // InternalDsl.g:3841:2: ( rule__Box__HeightAssignment_0_3 )
            // InternalDsl.g:3841:3: rule__Box__HeightAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__HeightAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getHeightAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__3__Impl"


    // $ANTLR start "rule__Box__Group_0__4"
    // InternalDsl.g:3849:1: rule__Box__Group_0__4 : rule__Box__Group_0__4__Impl rule__Box__Group_0__5 ;
    public final void rule__Box__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3853:1: ( rule__Box__Group_0__4__Impl rule__Box__Group_0__5 )
            // InternalDsl.g:3854:2: rule__Box__Group_0__4__Impl rule__Box__Group_0__5
            {
            pushFollow(FOLLOW_34);
            rule__Box__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__4"


    // $ANTLR start "rule__Box__Group_0__4__Impl"
    // InternalDsl.g:3861:1: rule__Box__Group_0__4__Impl : ( ( rule__Box__LengthAssignment_0_4 ) ) ;
    public final void rule__Box__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3865:1: ( ( ( rule__Box__LengthAssignment_0_4 ) ) )
            // InternalDsl.g:3866:1: ( ( rule__Box__LengthAssignment_0_4 ) )
            {
            // InternalDsl.g:3866:1: ( ( rule__Box__LengthAssignment_0_4 ) )
            // InternalDsl.g:3867:2: ( rule__Box__LengthAssignment_0_4 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_0_4()); 
            // InternalDsl.g:3868:2: ( rule__Box__LengthAssignment_0_4 )
            // InternalDsl.g:3868:3: rule__Box__LengthAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Box__LengthAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getLengthAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__4__Impl"


    // $ANTLR start "rule__Box__Group_0__5"
    // InternalDsl.g:3876:1: rule__Box__Group_0__5 : rule__Box__Group_0__5__Impl ;
    public final void rule__Box__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3880:1: ( rule__Box__Group_0__5__Impl )
            // InternalDsl.g:3881:2: rule__Box__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__5"


    // $ANTLR start "rule__Box__Group_0__5__Impl"
    // InternalDsl.g:3887:1: rule__Box__Group_0__5__Impl : ( ( rule__Box__WidthAssignment_0_5 ) ) ;
    public final void rule__Box__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3891:1: ( ( ( rule__Box__WidthAssignment_0_5 ) ) )
            // InternalDsl.g:3892:1: ( ( rule__Box__WidthAssignment_0_5 ) )
            {
            // InternalDsl.g:3892:1: ( ( rule__Box__WidthAssignment_0_5 ) )
            // InternalDsl.g:3893:2: ( rule__Box__WidthAssignment_0_5 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_0_5()); 
            // InternalDsl.g:3894:2: ( rule__Box__WidthAssignment_0_5 )
            // InternalDsl.g:3894:3: rule__Box__WidthAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Box__WidthAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getWidthAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_0__5__Impl"


    // $ANTLR start "rule__Box__Group_1__0"
    // InternalDsl.g:3903:1: rule__Box__Group_1__0 : rule__Box__Group_1__0__Impl rule__Box__Group_1__1 ;
    public final void rule__Box__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3907:1: ( rule__Box__Group_1__0__Impl rule__Box__Group_1__1 )
            // InternalDsl.g:3908:2: rule__Box__Group_1__0__Impl rule__Box__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Box__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__0"


    // $ANTLR start "rule__Box__Group_1__0__Impl"
    // InternalDsl.g:3915:1: rule__Box__Group_1__0__Impl : ( 'height' ) ;
    public final void rule__Box__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3919:1: ( ( 'height' ) )
            // InternalDsl.g:3920:1: ( 'height' )
            {
            // InternalDsl.g:3920:1: ( 'height' )
            // InternalDsl.g:3921:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getHeightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__0__Impl"


    // $ANTLR start "rule__Box__Group_1__1"
    // InternalDsl.g:3930:1: rule__Box__Group_1__1 : rule__Box__Group_1__1__Impl rule__Box__Group_1__2 ;
    public final void rule__Box__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3934:1: ( rule__Box__Group_1__1__Impl rule__Box__Group_1__2 )
            // InternalDsl.g:3935:2: rule__Box__Group_1__1__Impl rule__Box__Group_1__2
            {
            pushFollow(FOLLOW_48);
            rule__Box__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__1"


    // $ANTLR start "rule__Box__Group_1__1__Impl"
    // InternalDsl.g:3942:1: rule__Box__Group_1__1__Impl : ( ( rule__Box__HeightAssignment_1_1 ) ) ;
    public final void rule__Box__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3946:1: ( ( ( rule__Box__HeightAssignment_1_1 ) ) )
            // InternalDsl.g:3947:1: ( ( rule__Box__HeightAssignment_1_1 ) )
            {
            // InternalDsl.g:3947:1: ( ( rule__Box__HeightAssignment_1_1 ) )
            // InternalDsl.g:3948:2: ( rule__Box__HeightAssignment_1_1 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_1_1()); 
            // InternalDsl.g:3949:2: ( rule__Box__HeightAssignment_1_1 )
            // InternalDsl.g:3949:3: rule__Box__HeightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__HeightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getHeightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__1__Impl"


    // $ANTLR start "rule__Box__Group_1__2"
    // InternalDsl.g:3957:1: rule__Box__Group_1__2 : rule__Box__Group_1__2__Impl rule__Box__Group_1__3 ;
    public final void rule__Box__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3961:1: ( rule__Box__Group_1__2__Impl rule__Box__Group_1__3 )
            // InternalDsl.g:3962:2: rule__Box__Group_1__2__Impl rule__Box__Group_1__3
            {
            pushFollow(FOLLOW_34);
            rule__Box__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__2"


    // $ANTLR start "rule__Box__Group_1__2__Impl"
    // InternalDsl.g:3969:1: rule__Box__Group_1__2__Impl : ( 'length' ) ;
    public final void rule__Box__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3973:1: ( ( 'length' ) )
            // InternalDsl.g:3974:1: ( 'length' )
            {
            // InternalDsl.g:3974:1: ( 'length' )
            // InternalDsl.g:3975:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_1_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLengthKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__2__Impl"


    // $ANTLR start "rule__Box__Group_1__3"
    // InternalDsl.g:3984:1: rule__Box__Group_1__3 : rule__Box__Group_1__3__Impl rule__Box__Group_1__4 ;
    public final void rule__Box__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3988:1: ( rule__Box__Group_1__3__Impl rule__Box__Group_1__4 )
            // InternalDsl.g:3989:2: rule__Box__Group_1__3__Impl rule__Box__Group_1__4
            {
            pushFollow(FOLLOW_49);
            rule__Box__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__3"


    // $ANTLR start "rule__Box__Group_1__3__Impl"
    // InternalDsl.g:3996:1: rule__Box__Group_1__3__Impl : ( ( rule__Box__LengthAssignment_1_3 ) ) ;
    public final void rule__Box__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4000:1: ( ( ( rule__Box__LengthAssignment_1_3 ) ) )
            // InternalDsl.g:4001:1: ( ( rule__Box__LengthAssignment_1_3 ) )
            {
            // InternalDsl.g:4001:1: ( ( rule__Box__LengthAssignment_1_3 ) )
            // InternalDsl.g:4002:2: ( rule__Box__LengthAssignment_1_3 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_1_3()); 
            // InternalDsl.g:4003:2: ( rule__Box__LengthAssignment_1_3 )
            // InternalDsl.g:4003:3: rule__Box__LengthAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__LengthAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getLengthAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__3__Impl"


    // $ANTLR start "rule__Box__Group_1__4"
    // InternalDsl.g:4011:1: rule__Box__Group_1__4 : rule__Box__Group_1__4__Impl rule__Box__Group_1__5 ;
    public final void rule__Box__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4015:1: ( rule__Box__Group_1__4__Impl rule__Box__Group_1__5 )
            // InternalDsl.g:4016:2: rule__Box__Group_1__4__Impl rule__Box__Group_1__5
            {
            pushFollow(FOLLOW_34);
            rule__Box__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__4"


    // $ANTLR start "rule__Box__Group_1__4__Impl"
    // InternalDsl.g:4023:1: rule__Box__Group_1__4__Impl : ( 'width' ) ;
    public final void rule__Box__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4027:1: ( ( 'width' ) )
            // InternalDsl.g:4028:1: ( 'width' )
            {
            // InternalDsl.g:4028:1: ( 'width' )
            // InternalDsl.g:4029:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_1_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getWidthKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__4__Impl"


    // $ANTLR start "rule__Box__Group_1__5"
    // InternalDsl.g:4038:1: rule__Box__Group_1__5 : rule__Box__Group_1__5__Impl ;
    public final void rule__Box__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4042:1: ( rule__Box__Group_1__5__Impl )
            // InternalDsl.g:4043:2: rule__Box__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__5"


    // $ANTLR start "rule__Box__Group_1__5__Impl"
    // InternalDsl.g:4049:1: rule__Box__Group_1__5__Impl : ( ( rule__Box__WidthAssignment_1_5 ) ) ;
    public final void rule__Box__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4053:1: ( ( ( rule__Box__WidthAssignment_1_5 ) ) )
            // InternalDsl.g:4054:1: ( ( rule__Box__WidthAssignment_1_5 ) )
            {
            // InternalDsl.g:4054:1: ( ( rule__Box__WidthAssignment_1_5 ) )
            // InternalDsl.g:4055:2: ( rule__Box__WidthAssignment_1_5 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_1_5()); 
            // InternalDsl.g:4056:2: ( rule__Box__WidthAssignment_1_5 )
            // InternalDsl.g:4056:3: rule__Box__WidthAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Box__WidthAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getWidthAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_1__5__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalDsl.g:4065:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4069:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalDsl.g:4070:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalDsl.g:4077:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4081:1: ( ( 'Cylinder' ) )
            // InternalDsl.g:4082:1: ( 'Cylinder' )
            {
            // InternalDsl.g:4082:1: ( 'Cylinder' )
            // InternalDsl.g:4083:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalDsl.g:4092:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4096:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalDsl.g:4097:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalDsl.g:4104:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4108:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalDsl.g:4109:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalDsl.g:4109:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalDsl.g:4110:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalDsl.g:4111:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:4111:3: rule__Cylinder__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalDsl.g:4119:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4123:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalDsl.g:4124:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalDsl.g:4131:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4135:1: ( ( 'radius' ) )
            // InternalDsl.g:4136:1: ( 'radius' )
            {
            // InternalDsl.g:4136:1: ( 'radius' )
            // InternalDsl.g:4137:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalDsl.g:4146:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4150:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalDsl.g:4151:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalDsl.g:4158:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4162:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalDsl.g:4163:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalDsl.g:4163:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalDsl.g:4164:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalDsl.g:4165:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalDsl.g:4165:3: rule__Cylinder__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group__4"
    // InternalDsl.g:4173:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4177:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalDsl.g:4178:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Cylinder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4"


    // $ANTLR start "rule__Cylinder__Group__4__Impl"
    // InternalDsl.g:4185:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4189:1: ( ( 'length' ) )
            // InternalDsl.g:4190:1: ( 'length' )
            {
            // InternalDsl.g:4190:1: ( 'length' )
            // InternalDsl.g:4191:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__5"
    // InternalDsl.g:4200:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4204:1: ( rule__Cylinder__Group__5__Impl )
            // InternalDsl.g:4205:2: rule__Cylinder__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5"


    // $ANTLR start "rule__Cylinder__Group__5__Impl"
    // InternalDsl.g:4211:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4215:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalDsl.g:4216:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalDsl.g:4216:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalDsl.g:4217:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalDsl.g:4218:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalDsl.g:4218:3: rule__Cylinder__LengthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalDsl.g:4227:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4231:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalDsl.g:4232:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalDsl.g:4239:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4243:1: ( ( 'Mesh' ) )
            // InternalDsl.g:4244:1: ( 'Mesh' )
            {
            // InternalDsl.g:4244:1: ( 'Mesh' )
            // InternalDsl.g:4245:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalDsl.g:4254:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4258:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalDsl.g:4259:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalDsl.g:4266:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4270:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalDsl.g:4271:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalDsl.g:4271:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalDsl.g:4272:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalDsl.g:4273:2: ( rule__Mesh__NameAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:4273:3: rule__Mesh__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__2"
    // InternalDsl.g:4281:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4285:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalDsl.g:4286:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Mesh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2"


    // $ANTLR start "rule__Mesh__Group__2__Impl"
    // InternalDsl.g:4293:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4297:1: ( ( 'pathToFile' ) )
            // InternalDsl.g:4298:1: ( 'pathToFile' )
            {
            // InternalDsl.g:4298:1: ( 'pathToFile' )
            // InternalDsl.g:4299:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2__Impl"


    // $ANTLR start "rule__Mesh__Group__3"
    // InternalDsl.g:4308:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4312:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalDsl.g:4313:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__Mesh__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3"


    // $ANTLR start "rule__Mesh__Group__3__Impl"
    // InternalDsl.g:4320:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4324:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalDsl.g:4325:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalDsl.g:4325:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalDsl.g:4326:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalDsl.g:4327:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalDsl.g:4327:3: rule__Mesh__PathToFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__PathToFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3__Impl"


    // $ANTLR start "rule__Mesh__Group__4"
    // InternalDsl.g:4335:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4339:1: ( rule__Mesh__Group__4__Impl )
            // InternalDsl.g:4340:2: rule__Mesh__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4"


    // $ANTLR start "rule__Mesh__Group__4__Impl"
    // InternalDsl.g:4346:1: rule__Mesh__Group__4__Impl : ( ( rule__Mesh__Group_4__0 )? ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4350:1: ( ( ( rule__Mesh__Group_4__0 )? ) )
            // InternalDsl.g:4351:1: ( ( rule__Mesh__Group_4__0 )? )
            {
            // InternalDsl.g:4351:1: ( ( rule__Mesh__Group_4__0 )? )
            // InternalDsl.g:4352:2: ( rule__Mesh__Group_4__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_4()); 
            // InternalDsl.g:4353:2: ( rule__Mesh__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==60) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:4353:3: rule__Mesh__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4__Impl"


    // $ANTLR start "rule__Mesh__Group_4__0"
    // InternalDsl.g:4362:1: rule__Mesh__Group_4__0 : rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 ;
    public final void rule__Mesh__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4366:1: ( rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 )
            // InternalDsl.g:4367:2: rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1
            {
            pushFollow(FOLLOW_46);
            rule__Mesh__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0"


    // $ANTLR start "rule__Mesh__Group_4__0__Impl"
    // InternalDsl.g:4374:1: rule__Mesh__Group_4__0__Impl : ( 'scale' ) ;
    public final void rule__Mesh__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4378:1: ( ( 'scale' ) )
            // InternalDsl.g:4379:1: ( 'scale' )
            {
            // InternalDsl.g:4379:1: ( 'scale' )
            // InternalDsl.g:4380:2: 'scale'
            {
             before(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0__Impl"


    // $ANTLR start "rule__Mesh__Group_4__1"
    // InternalDsl.g:4389:1: rule__Mesh__Group_4__1 : rule__Mesh__Group_4__1__Impl ;
    public final void rule__Mesh__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4393:1: ( rule__Mesh__Group_4__1__Impl )
            // InternalDsl.g:4394:2: rule__Mesh__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1"


    // $ANTLR start "rule__Mesh__Group_4__1__Impl"
    // InternalDsl.g:4400:1: rule__Mesh__Group_4__1__Impl : ( ( rule__Mesh__BoxAssignment_4_1 ) ) ;
    public final void rule__Mesh__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4404:1: ( ( ( rule__Mesh__BoxAssignment_4_1 ) ) )
            // InternalDsl.g:4405:1: ( ( rule__Mesh__BoxAssignment_4_1 ) )
            {
            // InternalDsl.g:4405:1: ( ( rule__Mesh__BoxAssignment_4_1 ) )
            // InternalDsl.g:4406:2: ( rule__Mesh__BoxAssignment_4_1 )
            {
             before(grammarAccess.getMeshAccess().getBoxAssignment_4_1()); 
            // InternalDsl.g:4407:2: ( rule__Mesh__BoxAssignment_4_1 )
            // InternalDsl.g:4407:3: rule__Mesh__BoxAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__BoxAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getBoxAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalDsl.g:4416:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4420:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalDsl.g:4421:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalDsl.g:4428:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4432:1: ( ( 'Sphere' ) )
            // InternalDsl.g:4433:1: ( 'Sphere' )
            {
            // InternalDsl.g:4433:1: ( 'Sphere' )
            // InternalDsl.g:4434:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalDsl.g:4443:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4447:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalDsl.g:4448:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalDsl.g:4455:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4459:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalDsl.g:4460:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalDsl.g:4460:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalDsl.g:4461:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalDsl.g:4462:2: ( rule__Sphere__NameAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:4462:3: rule__Sphere__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalDsl.g:4470:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4474:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalDsl.g:4475:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Sphere__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalDsl.g:4482:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4486:1: ( ( 'radius' ) )
            // InternalDsl.g:4487:1: ( 'radius' )
            {
            // InternalDsl.g:4487:1: ( 'radius' )
            // InternalDsl.g:4488:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group__3"
    // InternalDsl.g:4497:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4501:1: ( rule__Sphere__Group__3__Impl )
            // InternalDsl.g:4502:2: rule__Sphere__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3"


    // $ANTLR start "rule__Sphere__Group__3__Impl"
    // InternalDsl.g:4508:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4512:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalDsl.g:4513:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalDsl.g:4513:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalDsl.g:4514:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalDsl.g:4515:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalDsl.g:4515:3: rule__Sphere__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalDsl.g:4524:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4528:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalDsl.g:4529:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalDsl.g:4536:1: rule__Limit__Group__0__Impl : ( ( rule__Limit__NameAssignment_0 )? ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4540:1: ( ( ( rule__Limit__NameAssignment_0 )? ) )
            // InternalDsl.g:4541:1: ( ( rule__Limit__NameAssignment_0 )? )
            {
            // InternalDsl.g:4541:1: ( ( rule__Limit__NameAssignment_0 )? )
            // InternalDsl.g:4542:2: ( rule__Limit__NameAssignment_0 )?
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_0()); 
            // InternalDsl.g:4543:2: ( rule__Limit__NameAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:4543:3: rule__Limit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalDsl.g:4551:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4555:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalDsl.g:4556:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalDsl.g:4563:1: rule__Limit__Group__1__Impl : ( ( rule__Limit__Group_1__0 )? ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4567:1: ( ( ( rule__Limit__Group_1__0 )? ) )
            // InternalDsl.g:4568:1: ( ( rule__Limit__Group_1__0 )? )
            {
            // InternalDsl.g:4568:1: ( ( rule__Limit__Group_1__0 )? )
            // InternalDsl.g:4569:2: ( rule__Limit__Group_1__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_1()); 
            // InternalDsl.g:4570:2: ( rule__Limit__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==64) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:4570:3: rule__Limit__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalDsl.g:4578:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4582:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalDsl.g:4583:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalDsl.g:4590:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__Group_2__0 )? ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4594:1: ( ( ( rule__Limit__Group_2__0 )? ) )
            // InternalDsl.g:4595:1: ( ( rule__Limit__Group_2__0 )? )
            {
            // InternalDsl.g:4595:1: ( ( rule__Limit__Group_2__0 )? )
            // InternalDsl.g:4596:2: ( rule__Limit__Group_2__0 )?
            {
             before(grammarAccess.getLimitAccess().getGroup_2()); 
            // InternalDsl.g:4597:2: ( rule__Limit__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==65) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:4597:3: rule__Limit__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalDsl.g:4605:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4609:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalDsl.g:4610:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalDsl.g:4617:1: rule__Limit__Group__3__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4621:1: ( ( 'effort' ) )
            // InternalDsl.g:4622:1: ( 'effort' )
            {
            // InternalDsl.g:4622:1: ( 'effort' )
            // InternalDsl.g:4623:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalDsl.g:4632:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4636:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalDsl.g:4637:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalDsl.g:4644:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__EffortAssignment_4 ) ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4648:1: ( ( ( rule__Limit__EffortAssignment_4 ) ) )
            // InternalDsl.g:4649:1: ( ( rule__Limit__EffortAssignment_4 ) )
            {
            // InternalDsl.g:4649:1: ( ( rule__Limit__EffortAssignment_4 ) )
            // InternalDsl.g:4650:2: ( rule__Limit__EffortAssignment_4 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_4()); 
            // InternalDsl.g:4651:2: ( rule__Limit__EffortAssignment_4 )
            // InternalDsl.g:4651:3: rule__Limit__EffortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalDsl.g:4659:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4663:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalDsl.g:4664:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Limit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalDsl.g:4671:1: rule__Limit__Group__5__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4675:1: ( ( 'velocity' ) )
            // InternalDsl.g:4676:1: ( 'velocity' )
            {
            // InternalDsl.g:4676:1: ( 'velocity' )
            // InternalDsl.g:4677:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_5()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Limit__Group__6"
    // InternalDsl.g:4686:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4690:1: ( rule__Limit__Group__6__Impl )
            // InternalDsl.g:4691:2: rule__Limit__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6"


    // $ANTLR start "rule__Limit__Group__6__Impl"
    // InternalDsl.g:4697:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__VelocityAssignment_6 ) ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4701:1: ( ( ( rule__Limit__VelocityAssignment_6 ) ) )
            // InternalDsl.g:4702:1: ( ( rule__Limit__VelocityAssignment_6 ) )
            {
            // InternalDsl.g:4702:1: ( ( rule__Limit__VelocityAssignment_6 ) )
            // InternalDsl.g:4703:2: ( rule__Limit__VelocityAssignment_6 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_6()); 
            // InternalDsl.g:4704:2: ( rule__Limit__VelocityAssignment_6 )
            // InternalDsl.g:4704:3: rule__Limit__VelocityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6__Impl"


    // $ANTLR start "rule__Limit__Group_1__0"
    // InternalDsl.g:4713:1: rule__Limit__Group_1__0 : rule__Limit__Group_1__0__Impl rule__Limit__Group_1__1 ;
    public final void rule__Limit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4717:1: ( rule__Limit__Group_1__0__Impl rule__Limit__Group_1__1 )
            // InternalDsl.g:4718:2: rule__Limit__Group_1__0__Impl rule__Limit__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Limit__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_1__0"


    // $ANTLR start "rule__Limit__Group_1__0__Impl"
    // InternalDsl.g:4725:1: rule__Limit__Group_1__0__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4729:1: ( ( 'lower' ) )
            // InternalDsl.g:4730:1: ( 'lower' )
            {
            // InternalDsl.g:4730:1: ( 'lower' )
            // InternalDsl.g:4731:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_1__0__Impl"


    // $ANTLR start "rule__Limit__Group_1__1"
    // InternalDsl.g:4740:1: rule__Limit__Group_1__1 : rule__Limit__Group_1__1__Impl ;
    public final void rule__Limit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4744:1: ( rule__Limit__Group_1__1__Impl )
            // InternalDsl.g:4745:2: rule__Limit__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_1__1"


    // $ANTLR start "rule__Limit__Group_1__1__Impl"
    // InternalDsl.g:4751:1: rule__Limit__Group_1__1__Impl : ( ( rule__Limit__LowerAssignment_1_1 ) ) ;
    public final void rule__Limit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4755:1: ( ( ( rule__Limit__LowerAssignment_1_1 ) ) )
            // InternalDsl.g:4756:1: ( ( rule__Limit__LowerAssignment_1_1 ) )
            {
            // InternalDsl.g:4756:1: ( ( rule__Limit__LowerAssignment_1_1 ) )
            // InternalDsl.g:4757:2: ( rule__Limit__LowerAssignment_1_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_1_1()); 
            // InternalDsl.g:4758:2: ( rule__Limit__LowerAssignment_1_1 )
            // InternalDsl.g:4758:3: rule__Limit__LowerAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_1__1__Impl"


    // $ANTLR start "rule__Limit__Group_2__0"
    // InternalDsl.g:4767:1: rule__Limit__Group_2__0 : rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 ;
    public final void rule__Limit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4771:1: ( rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1 )
            // InternalDsl.g:4772:2: rule__Limit__Group_2__0__Impl rule__Limit__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Limit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__0"


    // $ANTLR start "rule__Limit__Group_2__0__Impl"
    // InternalDsl.g:4779:1: rule__Limit__Group_2__0__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4783:1: ( ( 'upper' ) )
            // InternalDsl.g:4784:1: ( 'upper' )
            {
            // InternalDsl.g:4784:1: ( 'upper' )
            // InternalDsl.g:4785:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__0__Impl"


    // $ANTLR start "rule__Limit__Group_2__1"
    // InternalDsl.g:4794:1: rule__Limit__Group_2__1 : rule__Limit__Group_2__1__Impl ;
    public final void rule__Limit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4798:1: ( rule__Limit__Group_2__1__Impl )
            // InternalDsl.g:4799:2: rule__Limit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__1"


    // $ANTLR start "rule__Limit__Group_2__1__Impl"
    // InternalDsl.g:4805:1: rule__Limit__Group_2__1__Impl : ( ( rule__Limit__UpperAssignment_2_1 ) ) ;
    public final void rule__Limit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4809:1: ( ( ( rule__Limit__UpperAssignment_2_1 ) ) )
            // InternalDsl.g:4810:1: ( ( rule__Limit__UpperAssignment_2_1 ) )
            {
            // InternalDsl.g:4810:1: ( ( rule__Limit__UpperAssignment_2_1 ) )
            // InternalDsl.g:4811:2: ( rule__Limit__UpperAssignment_2_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_2_1()); 
            // InternalDsl.g:4812:2: ( rule__Limit__UpperAssignment_2_1 )
            // InternalDsl.g:4812:3: rule__Limit__UpperAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group_2__1__Impl"


    // $ANTLR start "rule__Axis__Group_0__0"
    // InternalDsl.g:4821:1: rule__Axis__Group_0__0 : rule__Axis__Group_0__0__Impl rule__Axis__Group_0__1 ;
    public final void rule__Axis__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4825:1: ( rule__Axis__Group_0__0__Impl rule__Axis__Group_0__1 )
            // InternalDsl.g:4826:2: rule__Axis__Group_0__0__Impl rule__Axis__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Axis__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__0"


    // $ANTLR start "rule__Axis__Group_0__0__Impl"
    // InternalDsl.g:4833:1: rule__Axis__Group_0__0__Impl : ( ( rule__Axis__NameAssignment_0_0 )? ) ;
    public final void rule__Axis__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4837:1: ( ( ( rule__Axis__NameAssignment_0_0 )? ) )
            // InternalDsl.g:4838:1: ( ( rule__Axis__NameAssignment_0_0 )? )
            {
            // InternalDsl.g:4838:1: ( ( rule__Axis__NameAssignment_0_0 )? )
            // InternalDsl.g:4839:2: ( rule__Axis__NameAssignment_0_0 )?
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_0_0()); 
            // InternalDsl.g:4840:2: ( rule__Axis__NameAssignment_0_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:4840:3: rule__Axis__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__NameAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__0__Impl"


    // $ANTLR start "rule__Axis__Group_0__1"
    // InternalDsl.g:4848:1: rule__Axis__Group_0__1 : rule__Axis__Group_0__1__Impl rule__Axis__Group_0__2 ;
    public final void rule__Axis__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4852:1: ( rule__Axis__Group_0__1__Impl rule__Axis__Group_0__2 )
            // InternalDsl.g:4853:2: rule__Axis__Group_0__1__Impl rule__Axis__Group_0__2
            {
            pushFollow(FOLLOW_34);
            rule__Axis__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__1"


    // $ANTLR start "rule__Axis__Group_0__1__Impl"
    // InternalDsl.g:4860:1: rule__Axis__Group_0__1__Impl : ( 'xyz' ) ;
    public final void rule__Axis__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4864:1: ( ( 'xyz' ) )
            // InternalDsl.g:4865:1: ( 'xyz' )
            {
            // InternalDsl.g:4865:1: ( 'xyz' )
            // InternalDsl.g:4866:2: 'xyz'
            {
             before(grammarAccess.getAxisAccess().getXyzKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXyzKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__1__Impl"


    // $ANTLR start "rule__Axis__Group_0__2"
    // InternalDsl.g:4875:1: rule__Axis__Group_0__2 : rule__Axis__Group_0__2__Impl rule__Axis__Group_0__3 ;
    public final void rule__Axis__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4879:1: ( rule__Axis__Group_0__2__Impl rule__Axis__Group_0__3 )
            // InternalDsl.g:4880:2: rule__Axis__Group_0__2__Impl rule__Axis__Group_0__3
            {
            pushFollow(FOLLOW_34);
            rule__Axis__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__2"


    // $ANTLR start "rule__Axis__Group_0__2__Impl"
    // InternalDsl.g:4887:1: rule__Axis__Group_0__2__Impl : ( ( rule__Axis__XAssignment_0_2 ) ) ;
    public final void rule__Axis__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4891:1: ( ( ( rule__Axis__XAssignment_0_2 ) ) )
            // InternalDsl.g:4892:1: ( ( rule__Axis__XAssignment_0_2 ) )
            {
            // InternalDsl.g:4892:1: ( ( rule__Axis__XAssignment_0_2 ) )
            // InternalDsl.g:4893:2: ( rule__Axis__XAssignment_0_2 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_0_2()); 
            // InternalDsl.g:4894:2: ( rule__Axis__XAssignment_0_2 )
            // InternalDsl.g:4894:3: rule__Axis__XAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__2__Impl"


    // $ANTLR start "rule__Axis__Group_0__3"
    // InternalDsl.g:4902:1: rule__Axis__Group_0__3 : rule__Axis__Group_0__3__Impl rule__Axis__Group_0__4 ;
    public final void rule__Axis__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4906:1: ( rule__Axis__Group_0__3__Impl rule__Axis__Group_0__4 )
            // InternalDsl.g:4907:2: rule__Axis__Group_0__3__Impl rule__Axis__Group_0__4
            {
            pushFollow(FOLLOW_34);
            rule__Axis__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__3"


    // $ANTLR start "rule__Axis__Group_0__3__Impl"
    // InternalDsl.g:4914:1: rule__Axis__Group_0__3__Impl : ( ( rule__Axis__YAssignment_0_3 ) ) ;
    public final void rule__Axis__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4918:1: ( ( ( rule__Axis__YAssignment_0_3 ) ) )
            // InternalDsl.g:4919:1: ( ( rule__Axis__YAssignment_0_3 ) )
            {
            // InternalDsl.g:4919:1: ( ( rule__Axis__YAssignment_0_3 ) )
            // InternalDsl.g:4920:2: ( rule__Axis__YAssignment_0_3 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_0_3()); 
            // InternalDsl.g:4921:2: ( rule__Axis__YAssignment_0_3 )
            // InternalDsl.g:4921:3: rule__Axis__YAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__3__Impl"


    // $ANTLR start "rule__Axis__Group_0__4"
    // InternalDsl.g:4929:1: rule__Axis__Group_0__4 : rule__Axis__Group_0__4__Impl ;
    public final void rule__Axis__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4933:1: ( rule__Axis__Group_0__4__Impl )
            // InternalDsl.g:4934:2: rule__Axis__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__4"


    // $ANTLR start "rule__Axis__Group_0__4__Impl"
    // InternalDsl.g:4940:1: rule__Axis__Group_0__4__Impl : ( ( rule__Axis__ZAssignment_0_4 ) ) ;
    public final void rule__Axis__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4944:1: ( ( ( rule__Axis__ZAssignment_0_4 ) ) )
            // InternalDsl.g:4945:1: ( ( rule__Axis__ZAssignment_0_4 ) )
            {
            // InternalDsl.g:4945:1: ( ( rule__Axis__ZAssignment_0_4 ) )
            // InternalDsl.g:4946:2: ( rule__Axis__ZAssignment_0_4 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_0_4()); 
            // InternalDsl.g:4947:2: ( rule__Axis__ZAssignment_0_4 )
            // InternalDsl.g:4947:3: rule__Axis__ZAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_0__4__Impl"


    // $ANTLR start "rule__Axis__Group_1__0"
    // InternalDsl.g:4956:1: rule__Axis__Group_1__0 : rule__Axis__Group_1__0__Impl rule__Axis__Group_1__1 ;
    public final void rule__Axis__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4960:1: ( rule__Axis__Group_1__0__Impl rule__Axis__Group_1__1 )
            // InternalDsl.g:4961:2: rule__Axis__Group_1__0__Impl rule__Axis__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Axis__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__0"


    // $ANTLR start "rule__Axis__Group_1__0__Impl"
    // InternalDsl.g:4968:1: rule__Axis__Group_1__0__Impl : ( 'x' ) ;
    public final void rule__Axis__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4972:1: ( ( 'x' ) )
            // InternalDsl.g:4973:1: ( 'x' )
            {
            // InternalDsl.g:4973:1: ( 'x' )
            // InternalDsl.g:4974:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__0__Impl"


    // $ANTLR start "rule__Axis__Group_1__1"
    // InternalDsl.g:4983:1: rule__Axis__Group_1__1 : rule__Axis__Group_1__1__Impl rule__Axis__Group_1__2 ;
    public final void rule__Axis__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4987:1: ( rule__Axis__Group_1__1__Impl rule__Axis__Group_1__2 )
            // InternalDsl.g:4988:2: rule__Axis__Group_1__1__Impl rule__Axis__Group_1__2
            {
            pushFollow(FOLLOW_53);
            rule__Axis__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__1"


    // $ANTLR start "rule__Axis__Group_1__1__Impl"
    // InternalDsl.g:4995:1: rule__Axis__Group_1__1__Impl : ( ( rule__Axis__XAssignment_1_1 ) ) ;
    public final void rule__Axis__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4999:1: ( ( ( rule__Axis__XAssignment_1_1 ) ) )
            // InternalDsl.g:5000:1: ( ( rule__Axis__XAssignment_1_1 ) )
            {
            // InternalDsl.g:5000:1: ( ( rule__Axis__XAssignment_1_1 ) )
            // InternalDsl.g:5001:2: ( rule__Axis__XAssignment_1_1 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_1_1()); 
            // InternalDsl.g:5002:2: ( rule__Axis__XAssignment_1_1 )
            // InternalDsl.g:5002:3: rule__Axis__XAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__1__Impl"


    // $ANTLR start "rule__Axis__Group_1__2"
    // InternalDsl.g:5010:1: rule__Axis__Group_1__2 : rule__Axis__Group_1__2__Impl rule__Axis__Group_1__3 ;
    public final void rule__Axis__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5014:1: ( rule__Axis__Group_1__2__Impl rule__Axis__Group_1__3 )
            // InternalDsl.g:5015:2: rule__Axis__Group_1__2__Impl rule__Axis__Group_1__3
            {
            pushFollow(FOLLOW_34);
            rule__Axis__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__2"


    // $ANTLR start "rule__Axis__Group_1__2__Impl"
    // InternalDsl.g:5022:1: rule__Axis__Group_1__2__Impl : ( 'y' ) ;
    public final void rule__Axis__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5026:1: ( ( 'y' ) )
            // InternalDsl.g:5027:1: ( 'y' )
            {
            // InternalDsl.g:5027:1: ( 'y' )
            // InternalDsl.g:5028:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_1_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__2__Impl"


    // $ANTLR start "rule__Axis__Group_1__3"
    // InternalDsl.g:5037:1: rule__Axis__Group_1__3 : rule__Axis__Group_1__3__Impl rule__Axis__Group_1__4 ;
    public final void rule__Axis__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5041:1: ( rule__Axis__Group_1__3__Impl rule__Axis__Group_1__4 )
            // InternalDsl.g:5042:2: rule__Axis__Group_1__3__Impl rule__Axis__Group_1__4
            {
            pushFollow(FOLLOW_54);
            rule__Axis__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__3"


    // $ANTLR start "rule__Axis__Group_1__3__Impl"
    // InternalDsl.g:5049:1: rule__Axis__Group_1__3__Impl : ( ( rule__Axis__YAssignment_1_3 ) ) ;
    public final void rule__Axis__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5053:1: ( ( ( rule__Axis__YAssignment_1_3 ) ) )
            // InternalDsl.g:5054:1: ( ( rule__Axis__YAssignment_1_3 ) )
            {
            // InternalDsl.g:5054:1: ( ( rule__Axis__YAssignment_1_3 ) )
            // InternalDsl.g:5055:2: ( rule__Axis__YAssignment_1_3 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_1_3()); 
            // InternalDsl.g:5056:2: ( rule__Axis__YAssignment_1_3 )
            // InternalDsl.g:5056:3: rule__Axis__YAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__3__Impl"


    // $ANTLR start "rule__Axis__Group_1__4"
    // InternalDsl.g:5064:1: rule__Axis__Group_1__4 : rule__Axis__Group_1__4__Impl rule__Axis__Group_1__5 ;
    public final void rule__Axis__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5068:1: ( rule__Axis__Group_1__4__Impl rule__Axis__Group_1__5 )
            // InternalDsl.g:5069:2: rule__Axis__Group_1__4__Impl rule__Axis__Group_1__5
            {
            pushFollow(FOLLOW_34);
            rule__Axis__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__4"


    // $ANTLR start "rule__Axis__Group_1__4__Impl"
    // InternalDsl.g:5076:1: rule__Axis__Group_1__4__Impl : ( 'z' ) ;
    public final void rule__Axis__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5080:1: ( ( 'z' ) )
            // InternalDsl.g:5081:1: ( 'z' )
            {
            // InternalDsl.g:5081:1: ( 'z' )
            // InternalDsl.g:5082:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_1_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__4__Impl"


    // $ANTLR start "rule__Axis__Group_1__5"
    // InternalDsl.g:5091:1: rule__Axis__Group_1__5 : rule__Axis__Group_1__5__Impl ;
    public final void rule__Axis__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5095:1: ( rule__Axis__Group_1__5__Impl )
            // InternalDsl.g:5096:2: rule__Axis__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__5"


    // $ANTLR start "rule__Axis__Group_1__5__Impl"
    // InternalDsl.g:5102:1: rule__Axis__Group_1__5__Impl : ( ( rule__Axis__ZAssignment_1_5 ) ) ;
    public final void rule__Axis__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5106:1: ( ( ( rule__Axis__ZAssignment_1_5 ) ) )
            // InternalDsl.g:5107:1: ( ( rule__Axis__ZAssignment_1_5 ) )
            {
            // InternalDsl.g:5107:1: ( ( rule__Axis__ZAssignment_1_5 ) )
            // InternalDsl.g:5108:2: ( rule__Axis__ZAssignment_1_5 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_1_5()); 
            // InternalDsl.g:5109:2: ( rule__Axis__ZAssignment_1_5 )
            // InternalDsl.g:5109:3: rule__Axis__ZAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group_1__5__Impl"


    // $ANTLR start "rule__Calibration__Group__0"
    // InternalDsl.g:5118:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5122:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalDsl.g:5123:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Calibration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0"


    // $ANTLR start "rule__Calibration__Group__0__Impl"
    // InternalDsl.g:5130:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5134:1: ( ( () ) )
            // InternalDsl.g:5135:1: ( () )
            {
            // InternalDsl.g:5135:1: ( () )
            // InternalDsl.g:5136:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalDsl.g:5137:2: ()
            // InternalDsl.g:5137:3: 
            {
            }

             after(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0__Impl"


    // $ANTLR start "rule__Calibration__Group__1"
    // InternalDsl.g:5145:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5149:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalDsl.g:5150:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Calibration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1"


    // $ANTLR start "rule__Calibration__Group__1__Impl"
    // InternalDsl.g:5157:1: rule__Calibration__Group__1__Impl : ( ( rule__Calibration__NameAssignment_1 )? ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5161:1: ( ( ( rule__Calibration__NameAssignment_1 )? ) )
            // InternalDsl.g:5162:1: ( ( rule__Calibration__NameAssignment_1 )? )
            {
            // InternalDsl.g:5162:1: ( ( rule__Calibration__NameAssignment_1 )? )
            // InternalDsl.g:5163:2: ( rule__Calibration__NameAssignment_1 )?
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_1()); 
            // InternalDsl.g:5164:2: ( rule__Calibration__NameAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:5164:3: rule__Calibration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1__Impl"


    // $ANTLR start "rule__Calibration__Group__2"
    // InternalDsl.g:5172:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5176:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalDsl.g:5177:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Calibration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2"


    // $ANTLR start "rule__Calibration__Group__2__Impl"
    // InternalDsl.g:5184:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__Group_2__0 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5188:1: ( ( ( rule__Calibration__Group_2__0 )? ) )
            // InternalDsl.g:5189:1: ( ( rule__Calibration__Group_2__0 )? )
            {
            // InternalDsl.g:5189:1: ( ( rule__Calibration__Group_2__0 )? )
            // InternalDsl.g:5190:2: ( rule__Calibration__Group_2__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_2()); 
            // InternalDsl.g:5191:2: ( rule__Calibration__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==69) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:5191:3: rule__Calibration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2__Impl"


    // $ANTLR start "rule__Calibration__Group__3"
    // InternalDsl.g:5199:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5203:1: ( rule__Calibration__Group__3__Impl )
            // InternalDsl.g:5204:2: rule__Calibration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3"


    // $ANTLR start "rule__Calibration__Group__3__Impl"
    // InternalDsl.g:5210:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5214:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalDsl.g:5215:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalDsl.g:5215:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalDsl.g:5216:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalDsl.g:5217:2: ( rule__Calibration__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==70) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:5217:3: rule__Calibration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3__Impl"


    // $ANTLR start "rule__Calibration__Group_2__0"
    // InternalDsl.g:5226:1: rule__Calibration__Group_2__0 : rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 ;
    public final void rule__Calibration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5230:1: ( rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 )
            // InternalDsl.g:5231:2: rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Calibration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0"


    // $ANTLR start "rule__Calibration__Group_2__0__Impl"
    // InternalDsl.g:5238:1: rule__Calibration__Group_2__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5242:1: ( ( 'rising' ) )
            // InternalDsl.g:5243:1: ( 'rising' )
            {
            // InternalDsl.g:5243:1: ( 'rising' )
            // InternalDsl.g:5244:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0__Impl"


    // $ANTLR start "rule__Calibration__Group_2__1"
    // InternalDsl.g:5253:1: rule__Calibration__Group_2__1 : rule__Calibration__Group_2__1__Impl ;
    public final void rule__Calibration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5257:1: ( rule__Calibration__Group_2__1__Impl )
            // InternalDsl.g:5258:2: rule__Calibration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1"


    // $ANTLR start "rule__Calibration__Group_2__1__Impl"
    // InternalDsl.g:5264:1: rule__Calibration__Group_2__1__Impl : ( ( rule__Calibration__RisingAssignment_2_1 ) ) ;
    public final void rule__Calibration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5268:1: ( ( ( rule__Calibration__RisingAssignment_2_1 ) ) )
            // InternalDsl.g:5269:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            {
            // InternalDsl.g:5269:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            // InternalDsl.g:5270:2: ( rule__Calibration__RisingAssignment_2_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 
            // InternalDsl.g:5271:2: ( rule__Calibration__RisingAssignment_2_1 )
            // InternalDsl.g:5271:3: rule__Calibration__RisingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__RisingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1__Impl"


    // $ANTLR start "rule__Calibration__Group_3__0"
    // InternalDsl.g:5280:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5284:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalDsl.g:5285:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Calibration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0"


    // $ANTLR start "rule__Calibration__Group_3__0__Impl"
    // InternalDsl.g:5292:1: rule__Calibration__Group_3__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5296:1: ( ( 'falling' ) )
            // InternalDsl.g:5297:1: ( 'falling' )
            {
            // InternalDsl.g:5297:1: ( 'falling' )
            // InternalDsl.g:5298:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3__1"
    // InternalDsl.g:5307:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5311:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalDsl.g:5312:2: rule__Calibration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1"


    // $ANTLR start "rule__Calibration__Group_3__1__Impl"
    // InternalDsl.g:5318:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__FallingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5322:1: ( ( ( rule__Calibration__FallingAssignment_3_1 ) ) )
            // InternalDsl.g:5323:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            {
            // InternalDsl.g:5323:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            // InternalDsl.g:5324:2: ( rule__Calibration__FallingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 
            // InternalDsl.g:5325:2: ( rule__Calibration__FallingAssignment_3_1 )
            // InternalDsl.g:5325:3: rule__Calibration__FallingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__FallingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalDsl.g:5334:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5338:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalDsl.g:5339:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Dynamics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0"


    // $ANTLR start "rule__Dynamics__Group__0__Impl"
    // InternalDsl.g:5346:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5350:1: ( ( () ) )
            // InternalDsl.g:5351:1: ( () )
            {
            // InternalDsl.g:5351:1: ( () )
            // InternalDsl.g:5352:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalDsl.g:5353:2: ()
            // InternalDsl.g:5353:3: 
            {
            }

             after(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0__Impl"


    // $ANTLR start "rule__Dynamics__Group__1"
    // InternalDsl.g:5361:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5365:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalDsl.g:5366:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Dynamics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1"


    // $ANTLR start "rule__Dynamics__Group__1__Impl"
    // InternalDsl.g:5373:1: rule__Dynamics__Group__1__Impl : ( ( rule__Dynamics__NameAssignment_1 )? ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5377:1: ( ( ( rule__Dynamics__NameAssignment_1 )? ) )
            // InternalDsl.g:5378:1: ( ( rule__Dynamics__NameAssignment_1 )? )
            {
            // InternalDsl.g:5378:1: ( ( rule__Dynamics__NameAssignment_1 )? )
            // InternalDsl.g:5379:2: ( rule__Dynamics__NameAssignment_1 )?
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_1()); 
            // InternalDsl.g:5380:2: ( rule__Dynamics__NameAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:5380:3: rule__Dynamics__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__2"
    // InternalDsl.g:5388:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5392:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalDsl.g:5393:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Dynamics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2"


    // $ANTLR start "rule__Dynamics__Group__2__Impl"
    // InternalDsl.g:5400:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__Group_2__0 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5404:1: ( ( ( rule__Dynamics__Group_2__0 )? ) )
            // InternalDsl.g:5405:1: ( ( rule__Dynamics__Group_2__0 )? )
            {
            // InternalDsl.g:5405:1: ( ( rule__Dynamics__Group_2__0 )? )
            // InternalDsl.g:5406:2: ( rule__Dynamics__Group_2__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_2()); 
            // InternalDsl.g:5407:2: ( rule__Dynamics__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:5407:3: rule__Dynamics__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2__Impl"


    // $ANTLR start "rule__Dynamics__Group__3"
    // InternalDsl.g:5415:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5419:1: ( rule__Dynamics__Group__3__Impl )
            // InternalDsl.g:5420:2: rule__Dynamics__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3"


    // $ANTLR start "rule__Dynamics__Group__3__Impl"
    // InternalDsl.g:5426:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5430:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalDsl.g:5431:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalDsl.g:5431:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalDsl.g:5432:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalDsl.g:5433:2: ( rule__Dynamics__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:5433:3: rule__Dynamics__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__0"
    // InternalDsl.g:5442:1: rule__Dynamics__Group_2__0 : rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 ;
    public final void rule__Dynamics__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5446:1: ( rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 )
            // InternalDsl.g:5447:2: rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Dynamics__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0"


    // $ANTLR start "rule__Dynamics__Group_2__0__Impl"
    // InternalDsl.g:5454:1: rule__Dynamics__Group_2__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5458:1: ( ( 'friction' ) )
            // InternalDsl.g:5459:1: ( 'friction' )
            {
            // InternalDsl.g:5459:1: ( 'friction' )
            // InternalDsl.g:5460:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__1"
    // InternalDsl.g:5469:1: rule__Dynamics__Group_2__1 : rule__Dynamics__Group_2__1__Impl ;
    public final void rule__Dynamics__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5473:1: ( rule__Dynamics__Group_2__1__Impl )
            // InternalDsl.g:5474:2: rule__Dynamics__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1"


    // $ANTLR start "rule__Dynamics__Group_2__1__Impl"
    // InternalDsl.g:5480:1: rule__Dynamics__Group_2__1__Impl : ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) ;
    public final void rule__Dynamics__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5484:1: ( ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) )
            // InternalDsl.g:5485:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            {
            // InternalDsl.g:5485:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            // InternalDsl.g:5486:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 
            // InternalDsl.g:5487:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            // InternalDsl.g:5487:3: rule__Dynamics__FrictionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__0"
    // InternalDsl.g:5496:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5500:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalDsl.g:5501:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Dynamics__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0"


    // $ANTLR start "rule__Dynamics__Group_3__0__Impl"
    // InternalDsl.g:5508:1: rule__Dynamics__Group_3__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5512:1: ( ( 'damping' ) )
            // InternalDsl.g:5513:1: ( 'damping' )
            {
            // InternalDsl.g:5513:1: ( 'damping' )
            // InternalDsl.g:5514:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__1"
    // InternalDsl.g:5523:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5527:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalDsl.g:5528:2: rule__Dynamics__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1"


    // $ANTLR start "rule__Dynamics__Group_3__1__Impl"
    // InternalDsl.g:5534:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__DampingAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5538:1: ( ( ( rule__Dynamics__DampingAssignment_3_1 ) ) )
            // InternalDsl.g:5539:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            {
            // InternalDsl.g:5539:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            // InternalDsl.g:5540:2: ( rule__Dynamics__DampingAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 
            // InternalDsl.g:5541:2: ( rule__Dynamics__DampingAssignment_3_1 )
            // InternalDsl.g:5541:3: rule__Dynamics__DampingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group__0"
    // InternalDsl.g:5550:1: rule__Mimic__Group__0 : rule__Mimic__Group__0__Impl rule__Mimic__Group__1 ;
    public final void rule__Mimic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5554:1: ( rule__Mimic__Group__0__Impl rule__Mimic__Group__1 )
            // InternalDsl.g:5555:2: rule__Mimic__Group__0__Impl rule__Mimic__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Mimic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0"


    // $ANTLR start "rule__Mimic__Group__0__Impl"
    // InternalDsl.g:5562:1: rule__Mimic__Group__0__Impl : ( ( rule__Mimic__NameAssignment_0 )? ) ;
    public final void rule__Mimic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5566:1: ( ( ( rule__Mimic__NameAssignment_0 )? ) )
            // InternalDsl.g:5567:1: ( ( rule__Mimic__NameAssignment_0 )? )
            {
            // InternalDsl.g:5567:1: ( ( rule__Mimic__NameAssignment_0 )? )
            // InternalDsl.g:5568:2: ( rule__Mimic__NameAssignment_0 )?
            {
             before(grammarAccess.getMimicAccess().getNameAssignment_0()); 
            // InternalDsl.g:5569:2: ( rule__Mimic__NameAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:5569:3: rule__Mimic__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0__Impl"


    // $ANTLR start "rule__Mimic__Group__1"
    // InternalDsl.g:5577:1: rule__Mimic__Group__1 : rule__Mimic__Group__1__Impl rule__Mimic__Group__2 ;
    public final void rule__Mimic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5581:1: ( rule__Mimic__Group__1__Impl rule__Mimic__Group__2 )
            // InternalDsl.g:5582:2: rule__Mimic__Group__1__Impl rule__Mimic__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Mimic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1"


    // $ANTLR start "rule__Mimic__Group__1__Impl"
    // InternalDsl.g:5589:1: rule__Mimic__Group__1__Impl : ( 'mimics' ) ;
    public final void rule__Mimic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5593:1: ( ( 'mimics' ) )
            // InternalDsl.g:5594:1: ( 'mimics' )
            {
            // InternalDsl.g:5594:1: ( 'mimics' )
            // InternalDsl.g:5595:2: 'mimics'
            {
             before(grammarAccess.getMimicAccess().getMimicsKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1__Impl"


    // $ANTLR start "rule__Mimic__Group__2"
    // InternalDsl.g:5604:1: rule__Mimic__Group__2 : rule__Mimic__Group__2__Impl rule__Mimic__Group__3 ;
    public final void rule__Mimic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5608:1: ( rule__Mimic__Group__2__Impl rule__Mimic__Group__3 )
            // InternalDsl.g:5609:2: rule__Mimic__Group__2__Impl rule__Mimic__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__Mimic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2"


    // $ANTLR start "rule__Mimic__Group__2__Impl"
    // InternalDsl.g:5616:1: rule__Mimic__Group__2__Impl : ( ( rule__Mimic__MimicsAssignment_2 ) ) ;
    public final void rule__Mimic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5620:1: ( ( ( rule__Mimic__MimicsAssignment_2 ) ) )
            // InternalDsl.g:5621:1: ( ( rule__Mimic__MimicsAssignment_2 ) )
            {
            // InternalDsl.g:5621:1: ( ( rule__Mimic__MimicsAssignment_2 ) )
            // InternalDsl.g:5622:2: ( rule__Mimic__MimicsAssignment_2 )
            {
             before(grammarAccess.getMimicAccess().getMimicsAssignment_2()); 
            // InternalDsl.g:5623:2: ( rule__Mimic__MimicsAssignment_2 )
            // InternalDsl.g:5623:3: rule__Mimic__MimicsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MimicsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMimicsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2__Impl"


    // $ANTLR start "rule__Mimic__Group__3"
    // InternalDsl.g:5631:1: rule__Mimic__Group__3 : rule__Mimic__Group__3__Impl rule__Mimic__Group__4 ;
    public final void rule__Mimic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5635:1: ( rule__Mimic__Group__3__Impl rule__Mimic__Group__4 )
            // InternalDsl.g:5636:2: rule__Mimic__Group__3__Impl rule__Mimic__Group__4
            {
            pushFollow(FOLLOW_55);
            rule__Mimic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3"


    // $ANTLR start "rule__Mimic__Group__3__Impl"
    // InternalDsl.g:5643:1: rule__Mimic__Group__3__Impl : ( ( rule__Mimic__Group_3__0 )? ) ;
    public final void rule__Mimic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5647:1: ( ( ( rule__Mimic__Group_3__0 )? ) )
            // InternalDsl.g:5648:1: ( ( rule__Mimic__Group_3__0 )? )
            {
            // InternalDsl.g:5648:1: ( ( rule__Mimic__Group_3__0 )? )
            // InternalDsl.g:5649:2: ( rule__Mimic__Group_3__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_3()); 
            // InternalDsl.g:5650:2: ( rule__Mimic__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==74) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:5650:3: rule__Mimic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3__Impl"


    // $ANTLR start "rule__Mimic__Group__4"
    // InternalDsl.g:5658:1: rule__Mimic__Group__4 : rule__Mimic__Group__4__Impl ;
    public final void rule__Mimic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5662:1: ( rule__Mimic__Group__4__Impl )
            // InternalDsl.g:5663:2: rule__Mimic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__4"


    // $ANTLR start "rule__Mimic__Group__4__Impl"
    // InternalDsl.g:5669:1: rule__Mimic__Group__4__Impl : ( ( rule__Mimic__Group_4__0 )? ) ;
    public final void rule__Mimic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5673:1: ( ( ( rule__Mimic__Group_4__0 )? ) )
            // InternalDsl.g:5674:1: ( ( rule__Mimic__Group_4__0 )? )
            {
            // InternalDsl.g:5674:1: ( ( rule__Mimic__Group_4__0 )? )
            // InternalDsl.g:5675:2: ( rule__Mimic__Group_4__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_4()); 
            // InternalDsl.g:5676:2: ( rule__Mimic__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==75) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:5676:3: rule__Mimic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__4__Impl"


    // $ANTLR start "rule__Mimic__Group_3__0"
    // InternalDsl.g:5685:1: rule__Mimic__Group_3__0 : rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 ;
    public final void rule__Mimic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5689:1: ( rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 )
            // InternalDsl.g:5690:2: rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Mimic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0"


    // $ANTLR start "rule__Mimic__Group_3__0__Impl"
    // InternalDsl.g:5697:1: rule__Mimic__Group_3__0__Impl : ( 'multiplier' ) ;
    public final void rule__Mimic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5701:1: ( ( 'multiplier' ) )
            // InternalDsl.g:5702:1: ( 'multiplier' )
            {
            // InternalDsl.g:5702:1: ( 'multiplier' )
            // InternalDsl.g:5703:2: 'multiplier'
            {
             before(grammarAccess.getMimicAccess().getMultiplierKeyword_3_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMultiplierKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0__Impl"


    // $ANTLR start "rule__Mimic__Group_3__1"
    // InternalDsl.g:5712:1: rule__Mimic__Group_3__1 : rule__Mimic__Group_3__1__Impl ;
    public final void rule__Mimic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5716:1: ( rule__Mimic__Group_3__1__Impl )
            // InternalDsl.g:5717:2: rule__Mimic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1"


    // $ANTLR start "rule__Mimic__Group_3__1__Impl"
    // InternalDsl.g:5723:1: rule__Mimic__Group_3__1__Impl : ( ( rule__Mimic__MultiplierAssignment_3_1 ) ) ;
    public final void rule__Mimic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5727:1: ( ( ( rule__Mimic__MultiplierAssignment_3_1 ) ) )
            // InternalDsl.g:5728:1: ( ( rule__Mimic__MultiplierAssignment_3_1 ) )
            {
            // InternalDsl.g:5728:1: ( ( rule__Mimic__MultiplierAssignment_3_1 ) )
            // InternalDsl.g:5729:2: ( rule__Mimic__MultiplierAssignment_3_1 )
            {
             before(grammarAccess.getMimicAccess().getMultiplierAssignment_3_1()); 
            // InternalDsl.g:5730:2: ( rule__Mimic__MultiplierAssignment_3_1 )
            // InternalDsl.g:5730:3: rule__Mimic__MultiplierAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MultiplierAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMultiplierAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group_4__0"
    // InternalDsl.g:5739:1: rule__Mimic__Group_4__0 : rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1 ;
    public final void rule__Mimic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5743:1: ( rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1 )
            // InternalDsl.g:5744:2: rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1
            {
            pushFollow(FOLLOW_34);
            rule__Mimic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__0"


    // $ANTLR start "rule__Mimic__Group_4__0__Impl"
    // InternalDsl.g:5751:1: rule__Mimic__Group_4__0__Impl : ( 'offSet' ) ;
    public final void rule__Mimic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5755:1: ( ( 'offSet' ) )
            // InternalDsl.g:5756:1: ( 'offSet' )
            {
            // InternalDsl.g:5756:1: ( 'offSet' )
            // InternalDsl.g:5757:2: 'offSet'
            {
             before(grammarAccess.getMimicAccess().getOffSetKeyword_4_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getOffSetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__0__Impl"


    // $ANTLR start "rule__Mimic__Group_4__1"
    // InternalDsl.g:5766:1: rule__Mimic__Group_4__1 : rule__Mimic__Group_4__1__Impl ;
    public final void rule__Mimic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5770:1: ( rule__Mimic__Group_4__1__Impl )
            // InternalDsl.g:5771:2: rule__Mimic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__1"


    // $ANTLR start "rule__Mimic__Group_4__1__Impl"
    // InternalDsl.g:5777:1: rule__Mimic__Group_4__1__Impl : ( ( rule__Mimic__OffSetAssignment_4_1 ) ) ;
    public final void rule__Mimic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5781:1: ( ( ( rule__Mimic__OffSetAssignment_4_1 ) ) )
            // InternalDsl.g:5782:1: ( ( rule__Mimic__OffSetAssignment_4_1 ) )
            {
            // InternalDsl.g:5782:1: ( ( rule__Mimic__OffSetAssignment_4_1 ) )
            // InternalDsl.g:5783:2: ( rule__Mimic__OffSetAssignment_4_1 )
            {
             before(grammarAccess.getMimicAccess().getOffSetAssignment_4_1()); 
            // InternalDsl.g:5784:2: ( rule__Mimic__OffSetAssignment_4_1 )
            // InternalDsl.g:5784:3: rule__Mimic__OffSetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__OffSetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getOffSetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalDsl.g:5793:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5797:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalDsl.g:5798:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SafetyController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0"


    // $ANTLR start "rule__SafetyController__Group__0__Impl"
    // InternalDsl.g:5805:1: rule__SafetyController__Group__0__Impl : ( ( rule__SafetyController__NameAssignment_0 )? ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5809:1: ( ( ( rule__SafetyController__NameAssignment_0 )? ) )
            // InternalDsl.g:5810:1: ( ( rule__SafetyController__NameAssignment_0 )? )
            {
            // InternalDsl.g:5810:1: ( ( rule__SafetyController__NameAssignment_0 )? )
            // InternalDsl.g:5811:2: ( rule__SafetyController__NameAssignment_0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_0()); 
            // InternalDsl.g:5812:2: ( rule__SafetyController__NameAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:5812:3: rule__SafetyController__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0__Impl"


    // $ANTLR start "rule__SafetyController__Group__1"
    // InternalDsl.g:5820:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5824:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalDsl.g:5825:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__SafetyController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1"


    // $ANTLR start "rule__SafetyController__Group__1__Impl"
    // InternalDsl.g:5832:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__Group_1__0 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5836:1: ( ( ( rule__SafetyController__Group_1__0 )? ) )
            // InternalDsl.g:5837:1: ( ( rule__SafetyController__Group_1__0 )? )
            {
            // InternalDsl.g:5837:1: ( ( rule__SafetyController__Group_1__0 )? )
            // InternalDsl.g:5838:2: ( rule__SafetyController__Group_1__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_1()); 
            // InternalDsl.g:5839:2: ( rule__SafetyController__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==77) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:5839:3: rule__SafetyController__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__2"
    // InternalDsl.g:5847:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5851:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalDsl.g:5852:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__SafetyController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2"


    // $ANTLR start "rule__SafetyController__Group__2__Impl"
    // InternalDsl.g:5859:1: rule__SafetyController__Group__2__Impl : ( ( rule__SafetyController__Group_2__0 )? ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5863:1: ( ( ( rule__SafetyController__Group_2__0 )? ) )
            // InternalDsl.g:5864:1: ( ( rule__SafetyController__Group_2__0 )? )
            {
            // InternalDsl.g:5864:1: ( ( rule__SafetyController__Group_2__0 )? )
            // InternalDsl.g:5865:2: ( rule__SafetyController__Group_2__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_2()); 
            // InternalDsl.g:5866:2: ( rule__SafetyController__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:5866:3: rule__SafetyController__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2__Impl"


    // $ANTLR start "rule__SafetyController__Group__3"
    // InternalDsl.g:5874:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5878:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalDsl.g:5879:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__SafetyController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3"


    // $ANTLR start "rule__SafetyController__Group__3__Impl"
    // InternalDsl.g:5886:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__Group_3__0 )? ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5890:1: ( ( ( rule__SafetyController__Group_3__0 )? ) )
            // InternalDsl.g:5891:1: ( ( rule__SafetyController__Group_3__0 )? )
            {
            // InternalDsl.g:5891:1: ( ( rule__SafetyController__Group_3__0 )? )
            // InternalDsl.g:5892:2: ( rule__SafetyController__Group_3__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_3()); 
            // InternalDsl.g:5893:2: ( rule__SafetyController__Group_3__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==79) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:5893:3: rule__SafetyController__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3__Impl"


    // $ANTLR start "rule__SafetyController__Group__4"
    // InternalDsl.g:5901:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5905:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalDsl.g:5906:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__SafetyController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4"


    // $ANTLR start "rule__SafetyController__Group__4__Impl"
    // InternalDsl.g:5913:1: rule__SafetyController__Group__4__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5917:1: ( ( 'k_velocity' ) )
            // InternalDsl.g:5918:1: ( 'k_velocity' )
            {
            // InternalDsl.g:5918:1: ( 'k_velocity' )
            // InternalDsl.g:5919:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4__Impl"


    // $ANTLR start "rule__SafetyController__Group__5"
    // InternalDsl.g:5928:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5932:1: ( rule__SafetyController__Group__5__Impl )
            // InternalDsl.g:5933:2: rule__SafetyController__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5"


    // $ANTLR start "rule__SafetyController__Group__5__Impl"
    // InternalDsl.g:5939:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__K_velocityAssignment_5 ) ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5943:1: ( ( ( rule__SafetyController__K_velocityAssignment_5 ) ) )
            // InternalDsl.g:5944:1: ( ( rule__SafetyController__K_velocityAssignment_5 ) )
            {
            // InternalDsl.g:5944:1: ( ( rule__SafetyController__K_velocityAssignment_5 ) )
            // InternalDsl.g:5945:2: ( rule__SafetyController__K_velocityAssignment_5 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5()); 
            // InternalDsl.g:5946:2: ( rule__SafetyController__K_velocityAssignment_5 )
            // InternalDsl.g:5946:3: rule__SafetyController__K_velocityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_velocityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5__Impl"


    // $ANTLR start "rule__SafetyController__Group_1__0"
    // InternalDsl.g:5955:1: rule__SafetyController__Group_1__0 : rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1 ;
    public final void rule__SafetyController__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5959:1: ( rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1 )
            // InternalDsl.g:5960:2: rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__SafetyController__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__0"


    // $ANTLR start "rule__SafetyController__Group_1__0__Impl"
    // InternalDsl.g:5967:1: rule__SafetyController__Group_1__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5971:1: ( ( 'softLowerLimit' ) )
            // InternalDsl.g:5972:1: ( 'softLowerLimit' )
            {
            // InternalDsl.g:5972:1: ( 'softLowerLimit' )
            // InternalDsl.g:5973:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_1__1"
    // InternalDsl.g:5982:1: rule__SafetyController__Group_1__1 : rule__SafetyController__Group_1__1__Impl ;
    public final void rule__SafetyController__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5986:1: ( rule__SafetyController__Group_1__1__Impl )
            // InternalDsl.g:5987:2: rule__SafetyController__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__1"


    // $ANTLR start "rule__SafetyController__Group_1__1__Impl"
    // InternalDsl.g:5993:1: rule__SafetyController__Group_1__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) ) ;
    public final void rule__SafetyController__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5997:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) ) )
            // InternalDsl.g:5998:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) )
            {
            // InternalDsl.g:5998:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) )
            // InternalDsl.g:5999:2: ( rule__SafetyController__SoftLowerLimitAssignment_1_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_1_1()); 
            // InternalDsl.g:6000:2: ( rule__SafetyController__SoftLowerLimitAssignment_1_1 )
            // InternalDsl.g:6000:3: rule__SafetyController__SoftLowerLimitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__0"
    // InternalDsl.g:6009:1: rule__SafetyController__Group_2__0 : rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 ;
    public final void rule__SafetyController__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6013:1: ( rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 )
            // InternalDsl.g:6014:2: rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__SafetyController__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0"


    // $ANTLR start "rule__SafetyController__Group_2__0__Impl"
    // InternalDsl.g:6021:1: rule__SafetyController__Group_2__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6025:1: ( ( 'softUpperLimit' ) )
            // InternalDsl.g:6026:1: ( 'softUpperLimit' )
            {
            // InternalDsl.g:6026:1: ( 'softUpperLimit' )
            // InternalDsl.g:6027:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__1"
    // InternalDsl.g:6036:1: rule__SafetyController__Group_2__1 : rule__SafetyController__Group_2__1__Impl ;
    public final void rule__SafetyController__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6040:1: ( rule__SafetyController__Group_2__1__Impl )
            // InternalDsl.g:6041:2: rule__SafetyController__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1"


    // $ANTLR start "rule__SafetyController__Group_2__1__Impl"
    // InternalDsl.g:6047:1: rule__SafetyController__Group_2__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) ) ;
    public final void rule__SafetyController__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6051:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) ) )
            // InternalDsl.g:6052:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) )
            {
            // InternalDsl.g:6052:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) )
            // InternalDsl.g:6053:2: ( rule__SafetyController__SoftUpperLimitAssignment_2_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_2_1()); 
            // InternalDsl.g:6054:2: ( rule__SafetyController__SoftUpperLimitAssignment_2_1 )
            // InternalDsl.g:6054:3: rule__SafetyController__SoftUpperLimitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__0"
    // InternalDsl.g:6063:1: rule__SafetyController__Group_3__0 : rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 ;
    public final void rule__SafetyController__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6067:1: ( rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 )
            // InternalDsl.g:6068:2: rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__SafetyController__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0"


    // $ANTLR start "rule__SafetyController__Group_3__0__Impl"
    // InternalDsl.g:6075:1: rule__SafetyController__Group_3__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6079:1: ( ( 'k_position' ) )
            // InternalDsl.g:6080:1: ( 'k_position' )
            {
            // InternalDsl.g:6080:1: ( 'k_position' )
            // InternalDsl.g:6081:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__1"
    // InternalDsl.g:6090:1: rule__SafetyController__Group_3__1 : rule__SafetyController__Group_3__1__Impl ;
    public final void rule__SafetyController__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6094:1: ( rule__SafetyController__Group_3__1__Impl )
            // InternalDsl.g:6095:2: rule__SafetyController__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1"


    // $ANTLR start "rule__SafetyController__Group_3__1__Impl"
    // InternalDsl.g:6101:1: rule__SafetyController__Group_3__1__Impl : ( ( rule__SafetyController__K_positionAssignment_3_1 ) ) ;
    public final void rule__SafetyController__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6105:1: ( ( ( rule__SafetyController__K_positionAssignment_3_1 ) ) )
            // InternalDsl.g:6106:1: ( ( rule__SafetyController__K_positionAssignment_3_1 ) )
            {
            // InternalDsl.g:6106:1: ( ( rule__SafetyController__K_positionAssignment_3_1 ) )
            // InternalDsl.g:6107:2: ( rule__SafetyController__K_positionAssignment_3_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_3_1()); 
            // InternalDsl.g:6108:2: ( rule__SafetyController__K_positionAssignment_3_1 )
            // InternalDsl.g:6108:3: rule__SafetyController__K_positionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalDsl.g:6117:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6121:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalDsl.g:6122:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalDsl.g:6129:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6133:1: ( ( RULE_INT ) )
            // InternalDsl.g:6134:1: ( RULE_INT )
            {
            // InternalDsl.g:6134:1: ( RULE_INT )
            // InternalDsl.g:6135:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalDsl.g:6144:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6148:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalDsl.g:6149:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalDsl.g:6156:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6160:1: ( ( '.' ) )
            // InternalDsl.g:6161:1: ( '.' )
            {
            // InternalDsl.g:6161:1: ( '.' )
            // InternalDsl.g:6162:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalDsl.g:6171:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6175:1: ( rule__FLOAT__Group__2__Impl )
            // InternalDsl.g:6176:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalDsl.g:6182:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6186:1: ( ( RULE_INT ) )
            // InternalDsl.g:6187:1: ( RULE_INT )
            {
            // InternalDsl.g:6187:1: ( RULE_INT )
            // InternalDsl.g:6188:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalDsl.g:6198:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6202:1: ( ( RULE_ID ) )
            // InternalDsl.g:6203:2: ( RULE_ID )
            {
            // InternalDsl.g:6203:2: ( RULE_ID )
            // InternalDsl.g:6204:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__LinkAssignment_2"
    // InternalDsl.g:6213:1: rule__Robot__LinkAssignment_2 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6217:1: ( ( ruleLink ) )
            // InternalDsl.g:6218:2: ( ruleLink )
            {
            // InternalDsl.g:6218:2: ( ruleLink )
            // InternalDsl.g:6219:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinkAssignment_2"


    // $ANTLR start "rule__Robot__JointAssignment_3"
    // InternalDsl.g:6228:1: rule__Robot__JointAssignment_3 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6232:1: ( ( ruleJoint ) )
            // InternalDsl.g:6233:2: ( ruleJoint )
            {
            // InternalDsl.g:6233:2: ( ruleJoint )
            // InternalDsl.g:6234:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_3"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalDsl.g:6243:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6247:1: ( ( RULE_ID ) )
            // InternalDsl.g:6248:2: ( RULE_ID )
            {
            // InternalDsl.g:6248:2: ( RULE_ID )
            // InternalDsl.g:6249:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_2"


    // $ANTLR start "rule__Link__VisualsAssignment_3"
    // InternalDsl.g:6258:1: rule__Link__VisualsAssignment_3 : ( ruleVisual ) ;
    public final void rule__Link__VisualsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6262:1: ( ( ruleVisual ) )
            // InternalDsl.g:6263:2: ( ruleVisual )
            {
            // InternalDsl.g:6263:2: ( ruleVisual )
            // InternalDsl.g:6264:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualsAssignment_3"


    // $ANTLR start "rule__Link__InertialAssignment_4"
    // InternalDsl.g:6273:1: rule__Link__InertialAssignment_4 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6277:1: ( ( ruleInertial ) )
            // InternalDsl.g:6278:2: ( ruleInertial )
            {
            // InternalDsl.g:6278:2: ( ruleInertial )
            // InternalDsl.g:6279:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_4"


    // $ANTLR start "rule__Link__CollisionAssignment_5_1"
    // InternalDsl.g:6288:1: rule__Link__CollisionAssignment_5_1 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6292:1: ( ( ruleCollision ) )
            // InternalDsl.g:6293:2: ( ruleCollision )
            {
            // InternalDsl.g:6293:2: ( ruleCollision )
            // InternalDsl.g:6294:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_5_1"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalDsl.g:6303:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6307:1: ( ( RULE_ID ) )
            // InternalDsl.g:6308:2: ( RULE_ID )
            {
            // InternalDsl.g:6308:2: ( RULE_ID )
            // InternalDsl.g:6309:3: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_3"
    // InternalDsl.g:6318:1: rule__Joint__TypeAssignment_3 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6322:1: ( ( ruleJointType ) )
            // InternalDsl.g:6323:2: ( ruleJointType )
            {
            // InternalDsl.g:6323:2: ( ruleJointType )
            // InternalDsl.g:6324:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_3"


    // $ANTLR start "rule__Joint__ChildOfAssignment_5"
    // InternalDsl.g:6333:1: rule__Joint__ChildOfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6337:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:6338:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:6338:2: ( ( RULE_ID ) )
            // InternalDsl.g:6339:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); 
            // InternalDsl.g:6340:3: ( RULE_ID )
            // InternalDsl.g:6341:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_5"


    // $ANTLR start "rule__Joint__ParentOfAssignment_7"
    // InternalDsl.g:6352:1: rule__Joint__ParentOfAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6356:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:6357:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:6357:2: ( ( RULE_ID ) )
            // InternalDsl.g:6358:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); 
            // InternalDsl.g:6359:3: ( RULE_ID )
            // InternalDsl.g:6360:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_7"


    // $ANTLR start "rule__Joint__LimitAssignment_8_1"
    // InternalDsl.g:6371:1: rule__Joint__LimitAssignment_8_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6375:1: ( ( ruleLimit ) )
            // InternalDsl.g:6376:2: ( ruleLimit )
            {
            // InternalDsl.g:6376:2: ( ruleLimit )
            // InternalDsl.g:6377:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_8_1"


    // $ANTLR start "rule__Joint__AxisAssignment_9_1"
    // InternalDsl.g:6386:1: rule__Joint__AxisAssignment_9_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6390:1: ( ( ruleAxis ) )
            // InternalDsl.g:6391:2: ( ruleAxis )
            {
            // InternalDsl.g:6391:2: ( ruleAxis )
            // InternalDsl.g:6392:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_9_1"


    // $ANTLR start "rule__Joint__OriginAssignment_10_1"
    // InternalDsl.g:6401:1: rule__Joint__OriginAssignment_10_1 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6405:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6406:2: ( ruleOrigin )
            {
            // InternalDsl.g:6406:2: ( ruleOrigin )
            // InternalDsl.g:6407:3: ruleOrigin
            {
             before(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_10_1"


    // $ANTLR start "rule__Joint__CalibrationAssignment_11_1"
    // InternalDsl.g:6416:1: rule__Joint__CalibrationAssignment_11_1 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6420:1: ( ( ruleCalibration ) )
            // InternalDsl.g:6421:2: ( ruleCalibration )
            {
            // InternalDsl.g:6421:2: ( ruleCalibration )
            // InternalDsl.g:6422:3: ruleCalibration
            {
             before(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__CalibrationAssignment_11_1"


    // $ANTLR start "rule__Joint__DynamicsAssignment_12_1"
    // InternalDsl.g:6431:1: rule__Joint__DynamicsAssignment_12_1 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6435:1: ( ( ruleDynamics ) )
            // InternalDsl.g:6436:2: ( ruleDynamics )
            {
            // InternalDsl.g:6436:2: ( ruleDynamics )
            // InternalDsl.g:6437:3: ruleDynamics
            {
             before(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DynamicsAssignment_12_1"


    // $ANTLR start "rule__Joint__MimicAssignment_13_1"
    // InternalDsl.g:6446:1: rule__Joint__MimicAssignment_13_1 : ( ruleMimic ) ;
    public final void rule__Joint__MimicAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6450:1: ( ( ruleMimic ) )
            // InternalDsl.g:6451:2: ( ruleMimic )
            {
            // InternalDsl.g:6451:2: ( ruleMimic )
            // InternalDsl.g:6452:3: ruleMimic
            {
             before(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__MimicAssignment_13_1"


    // $ANTLR start "rule__Joint__SafetycontrollerAssignment_14_1"
    // InternalDsl.g:6461:1: rule__Joint__SafetycontrollerAssignment_14_1 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6465:1: ( ( ruleSafetyController ) )
            // InternalDsl.g:6466:2: ( ruleSafetyController )
            {
            // InternalDsl.g:6466:2: ( ruleSafetyController )
            // InternalDsl.g:6467:3: ruleSafetyController
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SafetycontrollerAssignment_14_1"


    // $ANTLR start "rule__Inertial__NameAssignment_1"
    // InternalDsl.g:6476:1: rule__Inertial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6480:1: ( ( RULE_ID ) )
            // InternalDsl.g:6481:2: ( RULE_ID )
            {
            // InternalDsl.g:6481:2: ( RULE_ID )
            // InternalDsl.g:6482:3: RULE_ID
            {
             before(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__NameAssignment_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_3"
    // InternalDsl.g:6491:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6495:1: ( ( ruleInertia ) )
            // InternalDsl.g:6496:2: ( ruleInertia )
            {
            // InternalDsl.g:6496:2: ( ruleInertia )
            // InternalDsl.g:6497:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_3"


    // $ANTLR start "rule__Inertial__MassAssignment_5"
    // InternalDsl.g:6506:1: rule__Inertial__MassAssignment_5 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6510:1: ( ( ruleMass ) )
            // InternalDsl.g:6511:2: ( ruleMass )
            {
            // InternalDsl.g:6511:2: ( ruleMass )
            // InternalDsl.g:6512:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_5"


    // $ANTLR start "rule__Inertial__OriginAssignment_6"
    // InternalDsl.g:6521:1: rule__Inertial__OriginAssignment_6 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6525:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6526:2: ( ruleOrigin )
            {
            // InternalDsl.g:6526:2: ( ruleOrigin )
            // InternalDsl.g:6527:3: ruleOrigin
            {
             before(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__OriginAssignment_6"


    // $ANTLR start "rule__Visual__NameAssignment_1"
    // InternalDsl.g:6536:1: rule__Visual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6540:1: ( ( RULE_ID ) )
            // InternalDsl.g:6541:2: ( RULE_ID )
            {
            // InternalDsl.g:6541:2: ( RULE_ID )
            // InternalDsl.g:6542:3: RULE_ID
            {
             before(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__NameAssignment_1"


    // $ANTLR start "rule__Visual__GeometryAssignment_3"
    // InternalDsl.g:6551:1: rule__Visual__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6555:1: ( ( ruleGeometry ) )
            // InternalDsl.g:6556:2: ( ruleGeometry )
            {
            // InternalDsl.g:6556:2: ( ruleGeometry )
            // InternalDsl.g:6557:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_3"


    // $ANTLR start "rule__Visual__OriginAssignment_4"
    // InternalDsl.g:6566:1: rule__Visual__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6570:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6571:2: ( ruleOrigin )
            {
            // InternalDsl.g:6571:2: ( ruleOrigin )
            // InternalDsl.g:6572:3: ruleOrigin
            {
             before(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_4"


    // $ANTLR start "rule__Visual__MaterialAssignment_5_1"
    // InternalDsl.g:6581:1: rule__Visual__MaterialAssignment_5_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6585:1: ( ( ruleMaterial ) )
            // InternalDsl.g:6586:2: ( ruleMaterial )
            {
            // InternalDsl.g:6586:2: ( ruleMaterial )
            // InternalDsl.g:6587:3: ruleMaterial
            {
             before(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__MaterialAssignment_5_1"


    // $ANTLR start "rule__Collision__NameAssignment_0"
    // InternalDsl.g:6596:1: rule__Collision__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6600:1: ( ( RULE_ID ) )
            // InternalDsl.g:6601:2: ( RULE_ID )
            {
            // InternalDsl.g:6601:2: ( RULE_ID )
            // InternalDsl.g:6602:3: RULE_ID
            {
             before(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__NameAssignment_0"


    // $ANTLR start "rule__Collision__GeometryAssignment_2"
    // InternalDsl.g:6611:1: rule__Collision__GeometryAssignment_2 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6615:1: ( ( ruleGeometry ) )
            // InternalDsl.g:6616:2: ( ruleGeometry )
            {
            // InternalDsl.g:6616:2: ( ruleGeometry )
            // InternalDsl.g:6617:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_2"


    // $ANTLR start "rule__Collision__OriginAssignment_3_1"
    // InternalDsl.g:6626:1: rule__Collision__OriginAssignment_3_1 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6630:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6631:2: ( ruleOrigin )
            {
            // InternalDsl.g:6631:2: ( ruleOrigin )
            // InternalDsl.g:6632:3: ruleOrigin
            {
             before(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_3_1"


    // $ANTLR start "rule__Origin__NameAssignment_1"
    // InternalDsl.g:6641:1: rule__Origin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6645:1: ( ( RULE_ID ) )
            // InternalDsl.g:6646:2: ( RULE_ID )
            {
            // InternalDsl.g:6646:2: ( RULE_ID )
            // InternalDsl.g:6647:3: RULE_ID
            {
             before(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__NameAssignment_1"


    // $ANTLR start "rule__Origin__XAssignment_3"
    // InternalDsl.g:6656:1: rule__Origin__XAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Origin__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6660:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6661:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6661:2: ( ruleFLOAT )
            // InternalDsl.g:6662:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__XAssignment_3"


    // $ANTLR start "rule__Origin__YAssignment_4"
    // InternalDsl.g:6671:1: rule__Origin__YAssignment_4 : ( ruleFLOAT ) ;
    public final void rule__Origin__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6675:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6676:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6676:2: ( ruleFLOAT )
            // InternalDsl.g:6677:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YAssignment_4"


    // $ANTLR start "rule__Origin__ZAssignment_5"
    // InternalDsl.g:6686:1: rule__Origin__ZAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Origin__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6690:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6691:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6691:2: ( ruleFLOAT )
            // InternalDsl.g:6692:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__ZAssignment_5"


    // $ANTLR start "rule__Origin__RollAssignment_6_1"
    // InternalDsl.g:6701:1: rule__Origin__RollAssignment_6_1 : ( ruleFLOAT ) ;
    public final void rule__Origin__RollAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6705:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6706:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6706:2: ( ruleFLOAT )
            // InternalDsl.g:6707:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__RollAssignment_6_1"


    // $ANTLR start "rule__Origin__PitchAssignment_6_2"
    // InternalDsl.g:6716:1: rule__Origin__PitchAssignment_6_2 : ( ruleFLOAT ) ;
    public final void rule__Origin__PitchAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6720:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6721:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6721:2: ( ruleFLOAT )
            // InternalDsl.g:6722:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__PitchAssignment_6_2"


    // $ANTLR start "rule__Origin__YawAssignment_6_3"
    // InternalDsl.g:6731:1: rule__Origin__YawAssignment_6_3 : ( ruleFLOAT ) ;
    public final void rule__Origin__YawAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6735:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6736:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6736:2: ( ruleFLOAT )
            // InternalDsl.g:6737:3: ruleFLOAT
            {
             before(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YawAssignment_6_3"


    // $ANTLR start "rule__Mass__NameAssignment_0"
    // InternalDsl.g:6746:1: rule__Mass__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6750:1: ( ( RULE_ID ) )
            // InternalDsl.g:6751:2: ( RULE_ID )
            {
            // InternalDsl.g:6751:2: ( RULE_ID )
            // InternalDsl.g:6752:3: RULE_ID
            {
             before(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__NameAssignment_0"


    // $ANTLR start "rule__Mass__MassValueInKilogramsAssignment_2"
    // InternalDsl.g:6761:1: rule__Mass__MassValueInKilogramsAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Mass__MassValueInKilogramsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6765:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6766:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6766:2: ( ruleFLOAT )
            // InternalDsl.g:6767:3: ruleFLOAT
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__MassValueInKilogramsAssignment_2"


    // $ANTLR start "rule__Inertia__NameAssignment_0"
    // InternalDsl.g:6776:1: rule__Inertia__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6780:1: ( ( RULE_ID ) )
            // InternalDsl.g:6781:2: ( RULE_ID )
            {
            // InternalDsl.g:6781:2: ( RULE_ID )
            // InternalDsl.g:6782:3: RULE_ID
            {
             before(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__NameAssignment_0"


    // $ANTLR start "rule__Inertia__IxxAssignment_2"
    // InternalDsl.g:6791:1: rule__Inertia__IxxAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IxxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6795:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6796:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6796:2: ( ruleFLOAT )
            // InternalDsl.g:6797:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIxxFLOATParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxxFLOATParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxxAssignment_2"


    // $ANTLR start "rule__Inertia__IxyAssignment_4"
    // InternalDsl.g:6806:1: rule__Inertia__IxyAssignment_4 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IxyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6810:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6811:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6811:2: ( ruleFLOAT )
            // InternalDsl.g:6812:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIxyFLOATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxyFLOATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxyAssignment_4"


    // $ANTLR start "rule__Inertia__IxzAssignment_6"
    // InternalDsl.g:6821:1: rule__Inertia__IxzAssignment_6 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IxzAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6825:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6826:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6826:2: ( ruleFLOAT )
            // InternalDsl.g:6827:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIxzFLOATParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxzFLOATParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxzAssignment_6"


    // $ANTLR start "rule__Inertia__IyyAssignment_8"
    // InternalDsl.g:6836:1: rule__Inertia__IyyAssignment_8 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IyyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6840:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6841:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6841:2: ( ruleFLOAT )
            // InternalDsl.g:6842:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIyyFLOATParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyyFLOATParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyyAssignment_8"


    // $ANTLR start "rule__Inertia__IyzAssignment_10"
    // InternalDsl.g:6851:1: rule__Inertia__IyzAssignment_10 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IyzAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6855:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6856:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6856:2: ( ruleFLOAT )
            // InternalDsl.g:6857:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIyzFLOATParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyzFLOATParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyzAssignment_10"


    // $ANTLR start "rule__Inertia__IzzAssignment_12"
    // InternalDsl.g:6866:1: rule__Inertia__IzzAssignment_12 : ( ruleFLOAT ) ;
    public final void rule__Inertia__IzzAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6870:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6871:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6871:2: ( ruleFLOAT )
            // InternalDsl.g:6872:3: ruleFLOAT
            {
             before(grammarAccess.getInertiaAccess().getIzzFLOATParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIzzFLOATParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IzzAssignment_12"


    // $ANTLR start "rule__Color__NameAssignment_0_1"
    // InternalDsl.g:6881:1: rule__Color__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6885:1: ( ( RULE_ID ) )
            // InternalDsl.g:6886:2: ( RULE_ID )
            {
            // InternalDsl.g:6886:2: ( RULE_ID )
            // InternalDsl.g:6887:3: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__NameAssignment_0_1"


    // $ANTLR start "rule__Color__RedAssignment_0_3"
    // InternalDsl.g:6896:1: rule__Color__RedAssignment_0_3 : ( ruleFLOAT ) ;
    public final void rule__Color__RedAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6900:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6901:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6901:2: ( ruleFLOAT )
            // InternalDsl.g:6902:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RedAssignment_0_3"


    // $ANTLR start "rule__Color__GreenAssignment_0_4"
    // InternalDsl.g:6911:1: rule__Color__GreenAssignment_0_4 : ( ruleFLOAT ) ;
    public final void rule__Color__GreenAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6915:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6916:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6916:2: ( ruleFLOAT )
            // InternalDsl.g:6917:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GreenAssignment_0_4"


    // $ANTLR start "rule__Color__BlueAssignment_0_5"
    // InternalDsl.g:6926:1: rule__Color__BlueAssignment_0_5 : ( ruleFLOAT ) ;
    public final void rule__Color__BlueAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6930:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6931:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6931:2: ( ruleFLOAT )
            // InternalDsl.g:6932:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BlueAssignment_0_5"


    // $ANTLR start "rule__Color__AlphaAssignment_0_6"
    // InternalDsl.g:6941:1: rule__Color__AlphaAssignment_0_6 : ( ruleFLOAT ) ;
    public final void rule__Color__AlphaAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6945:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6946:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6946:2: ( ruleFLOAT )
            // InternalDsl.g:6947:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__AlphaAssignment_0_6"


    // $ANTLR start "rule__Color__RedAssignment_1_1"
    // InternalDsl.g:6956:1: rule__Color__RedAssignment_1_1 : ( ruleFLOAT ) ;
    public final void rule__Color__RedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6960:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6961:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6961:2: ( ruleFLOAT )
            // InternalDsl.g:6962:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RedAssignment_1_1"


    // $ANTLR start "rule__Color__GreenAssignment_1_3"
    // InternalDsl.g:6971:1: rule__Color__GreenAssignment_1_3 : ( ruleFLOAT ) ;
    public final void rule__Color__GreenAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6975:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6976:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6976:2: ( ruleFLOAT )
            // InternalDsl.g:6977:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GreenAssignment_1_3"


    // $ANTLR start "rule__Color__BlueAssignment_1_5"
    // InternalDsl.g:6986:1: rule__Color__BlueAssignment_1_5 : ( ruleFLOAT ) ;
    public final void rule__Color__BlueAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6990:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6991:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6991:2: ( ruleFLOAT )
            // InternalDsl.g:6992:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BlueAssignment_1_5"


    // $ANTLR start "rule__Color__AlphaAssignment_1_7"
    // InternalDsl.g:7001:1: rule__Color__AlphaAssignment_1_7 : ( ruleFLOAT ) ;
    public final void rule__Color__AlphaAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7005:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7006:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7006:2: ( ruleFLOAT )
            // InternalDsl.g:7007:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_1_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__AlphaAssignment_1_7"


    // $ANTLR start "rule__Texture__NameAssignment_1"
    // InternalDsl.g:7016:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7020:1: ( ( RULE_ID ) )
            // InternalDsl.g:7021:2: ( RULE_ID )
            {
            // InternalDsl.g:7021:2: ( RULE_ID )
            // InternalDsl.g:7022:3: RULE_ID
            {
             before(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__NameAssignment_1"


    // $ANTLR start "rule__Texture__PathToFileAssignment_3"
    // InternalDsl.g:7031:1: rule__Texture__PathToFileAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7035:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7036:2: ( RULE_STRING )
            {
            // InternalDsl.g:7036:2: ( RULE_STRING )
            // InternalDsl.g:7037:3: RULE_STRING
            {
             before(grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__PathToFileAssignment_3"


    // $ANTLR start "rule__Box__NameAssignment_0_1"
    // InternalDsl.g:7046:1: rule__Box__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7050:1: ( ( RULE_ID ) )
            // InternalDsl.g:7051:2: ( RULE_ID )
            {
            // InternalDsl.g:7051:2: ( RULE_ID )
            // InternalDsl.g:7052:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_0_1"


    // $ANTLR start "rule__Box__HeightAssignment_0_3"
    // InternalDsl.g:7061:1: rule__Box__HeightAssignment_0_3 : ( ruleFLOAT ) ;
    public final void rule__Box__HeightAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7065:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7066:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7066:2: ( ruleFLOAT )
            // InternalDsl.g:7067:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__HeightAssignment_0_3"


    // $ANTLR start "rule__Box__LengthAssignment_0_4"
    // InternalDsl.g:7076:1: rule__Box__LengthAssignment_0_4 : ( ruleFLOAT ) ;
    public final void rule__Box__LengthAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7080:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7081:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7081:2: ( ruleFLOAT )
            // InternalDsl.g:7082:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__LengthAssignment_0_4"


    // $ANTLR start "rule__Box__WidthAssignment_0_5"
    // InternalDsl.g:7091:1: rule__Box__WidthAssignment_0_5 : ( ruleFLOAT ) ;
    public final void rule__Box__WidthAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7095:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7096:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7096:2: ( ruleFLOAT )
            // InternalDsl.g:7097:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__WidthAssignment_0_5"


    // $ANTLR start "rule__Box__HeightAssignment_1_1"
    // InternalDsl.g:7106:1: rule__Box__HeightAssignment_1_1 : ( ruleFLOAT ) ;
    public final void rule__Box__HeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7110:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7111:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7111:2: ( ruleFLOAT )
            // InternalDsl.g:7112:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__HeightAssignment_1_1"


    // $ANTLR start "rule__Box__LengthAssignment_1_3"
    // InternalDsl.g:7121:1: rule__Box__LengthAssignment_1_3 : ( ruleFLOAT ) ;
    public final void rule__Box__LengthAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7125:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7126:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7126:2: ( ruleFLOAT )
            // InternalDsl.g:7127:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__LengthAssignment_1_3"


    // $ANTLR start "rule__Box__WidthAssignment_1_5"
    // InternalDsl.g:7136:1: rule__Box__WidthAssignment_1_5 : ( ruleFLOAT ) ;
    public final void rule__Box__WidthAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7140:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7141:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7141:2: ( ruleFLOAT )
            // InternalDsl.g:7142:3: ruleFLOAT
            {
             before(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__WidthAssignment_1_5"


    // $ANTLR start "rule__Cylinder__NameAssignment_1"
    // InternalDsl.g:7151:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7155:1: ( ( RULE_ID ) )
            // InternalDsl.g:7156:2: ( RULE_ID )
            {
            // InternalDsl.g:7156:2: ( RULE_ID )
            // InternalDsl.g:7157:3: RULE_ID
            {
             before(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__NameAssignment_1"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_3"
    // InternalDsl.g:7166:1: rule__Cylinder__RadiusAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7170:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7171:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7171:2: ( ruleFLOAT )
            // InternalDsl.g:7172:3: ruleFLOAT
            {
             before(grammarAccess.getCylinderAccess().getRadiusFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_3"


    // $ANTLR start "rule__Cylinder__LengthAssignment_5"
    // InternalDsl.g:7181:1: rule__Cylinder__LengthAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7185:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7186:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7186:2: ( ruleFLOAT )
            // InternalDsl.g:7187:3: ruleFLOAT
            {
             before(grammarAccess.getCylinderAccess().getLengthFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__LengthAssignment_5"


    // $ANTLR start "rule__Mesh__NameAssignment_1"
    // InternalDsl.g:7196:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7200:1: ( ( RULE_ID ) )
            // InternalDsl.g:7201:2: ( RULE_ID )
            {
            // InternalDsl.g:7201:2: ( RULE_ID )
            // InternalDsl.g:7202:3: RULE_ID
            {
             before(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__NameAssignment_1"


    // $ANTLR start "rule__Mesh__PathToFileAssignment_3"
    // InternalDsl.g:7211:1: rule__Mesh__PathToFileAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7215:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7216:2: ( RULE_STRING )
            {
            // InternalDsl.g:7216:2: ( RULE_STRING )
            // InternalDsl.g:7217:3: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__PathToFileAssignment_3"


    // $ANTLR start "rule__Mesh__BoxAssignment_4_1"
    // InternalDsl.g:7226:1: rule__Mesh__BoxAssignment_4_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Mesh__BoxAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7230:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:7231:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:7231:2: ( ( RULE_STRING ) )
            // InternalDsl.g:7232:3: ( RULE_STRING )
            {
             before(grammarAccess.getMeshAccess().getBoxBoxCrossReference_4_1_0()); 
            // InternalDsl.g:7233:3: ( RULE_STRING )
            // InternalDsl.g:7234:4: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getBoxBoxSTRINGTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getBoxBoxSTRINGTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMeshAccess().getBoxBoxCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__BoxAssignment_4_1"


    // $ANTLR start "rule__Sphere__NameAssignment_1"
    // InternalDsl.g:7245:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7249:1: ( ( RULE_ID ) )
            // InternalDsl.g:7250:2: ( RULE_ID )
            {
            // InternalDsl.g:7250:2: ( RULE_ID )
            // InternalDsl.g:7251:3: RULE_ID
            {
             before(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__NameAssignment_1"


    // $ANTLR start "rule__Sphere__RadiusAssignment_3"
    // InternalDsl.g:7260:1: rule__Sphere__RadiusAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7264:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7265:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7265:2: ( ruleFLOAT )
            // InternalDsl.g:7266:3: ruleFLOAT
            {
             before(grammarAccess.getSphereAccess().getRadiusFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_3"


    // $ANTLR start "rule__Limit__NameAssignment_0"
    // InternalDsl.g:7275:1: rule__Limit__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7279:1: ( ( RULE_ID ) )
            // InternalDsl.g:7280:2: ( RULE_ID )
            {
            // InternalDsl.g:7280:2: ( RULE_ID )
            // InternalDsl.g:7281:3: RULE_ID
            {
             before(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__NameAssignment_0"


    // $ANTLR start "rule__Limit__LowerAssignment_1_1"
    // InternalDsl.g:7290:1: rule__Limit__LowerAssignment_1_1 : ( ruleFLOAT ) ;
    public final void rule__Limit__LowerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7294:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7295:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7295:2: ( ruleFLOAT )
            // InternalDsl.g:7296:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_1_1"


    // $ANTLR start "rule__Limit__UpperAssignment_2_1"
    // InternalDsl.g:7305:1: rule__Limit__UpperAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Limit__UpperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7309:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7310:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7310:2: ( ruleFLOAT )
            // InternalDsl.g:7311:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_2_1"


    // $ANTLR start "rule__Limit__EffortAssignment_4"
    // InternalDsl.g:7320:1: rule__Limit__EffortAssignment_4 : ( ruleFLOAT ) ;
    public final void rule__Limit__EffortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7324:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7325:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7325:2: ( ruleFLOAT )
            // InternalDsl.g:7326:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_4"


    // $ANTLR start "rule__Limit__VelocityAssignment_6"
    // InternalDsl.g:7335:1: rule__Limit__VelocityAssignment_6 : ( ruleFLOAT ) ;
    public final void rule__Limit__VelocityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7339:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7340:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7340:2: ( ruleFLOAT )
            // InternalDsl.g:7341:3: ruleFLOAT
            {
             before(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_6"


    // $ANTLR start "rule__Axis__NameAssignment_0_0"
    // InternalDsl.g:7350:1: rule__Axis__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7354:1: ( ( RULE_ID ) )
            // InternalDsl.g:7355:2: ( RULE_ID )
            {
            // InternalDsl.g:7355:2: ( RULE_ID )
            // InternalDsl.g:7356:3: RULE_ID
            {
             before(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__NameAssignment_0_0"


    // $ANTLR start "rule__Axis__XAssignment_0_2"
    // InternalDsl.g:7365:1: rule__Axis__XAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Axis__XAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7369:1: ( ( RULE_INT ) )
            // InternalDsl.g:7370:2: ( RULE_INT )
            {
            // InternalDsl.g:7370:2: ( RULE_INT )
            // InternalDsl.g:7371:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_0_2"


    // $ANTLR start "rule__Axis__YAssignment_0_3"
    // InternalDsl.g:7380:1: rule__Axis__YAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__Axis__YAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7384:1: ( ( RULE_INT ) )
            // InternalDsl.g:7385:2: ( RULE_INT )
            {
            // InternalDsl.g:7385:2: ( RULE_INT )
            // InternalDsl.g:7386:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_0_3"


    // $ANTLR start "rule__Axis__ZAssignment_0_4"
    // InternalDsl.g:7395:1: rule__Axis__ZAssignment_0_4 : ( RULE_INT ) ;
    public final void rule__Axis__ZAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7399:1: ( ( RULE_INT ) )
            // InternalDsl.g:7400:2: ( RULE_INT )
            {
            // InternalDsl.g:7400:2: ( RULE_INT )
            // InternalDsl.g:7401:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_0_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_0_4"


    // $ANTLR start "rule__Axis__XAssignment_1_1"
    // InternalDsl.g:7410:1: rule__Axis__XAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Axis__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7414:1: ( ( RULE_INT ) )
            // InternalDsl.g:7415:2: ( RULE_INT )
            {
            // InternalDsl.g:7415:2: ( RULE_INT )
            // InternalDsl.g:7416:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_1_1"


    // $ANTLR start "rule__Axis__YAssignment_1_3"
    // InternalDsl.g:7425:1: rule__Axis__YAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Axis__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7429:1: ( ( RULE_INT ) )
            // InternalDsl.g:7430:2: ( RULE_INT )
            {
            // InternalDsl.g:7430:2: ( RULE_INT )
            // InternalDsl.g:7431:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_1_3"


    // $ANTLR start "rule__Axis__ZAssignment_1_5"
    // InternalDsl.g:7440:1: rule__Axis__ZAssignment_1_5 : ( RULE_INT ) ;
    public final void rule__Axis__ZAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7444:1: ( ( RULE_INT ) )
            // InternalDsl.g:7445:2: ( RULE_INT )
            {
            // InternalDsl.g:7445:2: ( RULE_INT )
            // InternalDsl.g:7446:3: RULE_INT
            {
             before(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_1_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZINTTerminalRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_1_5"


    // $ANTLR start "rule__Calibration__NameAssignment_1"
    // InternalDsl.g:7455:1: rule__Calibration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7459:1: ( ( RULE_ID ) )
            // InternalDsl.g:7460:2: ( RULE_ID )
            {
            // InternalDsl.g:7460:2: ( RULE_ID )
            // InternalDsl.g:7461:3: RULE_ID
            {
             before(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__NameAssignment_1"


    // $ANTLR start "rule__Calibration__RisingAssignment_2_1"
    // InternalDsl.g:7470:1: rule__Calibration__RisingAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Calibration__RisingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7474:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7475:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7475:2: ( ruleFLOAT )
            // InternalDsl.g:7476:3: ruleFLOAT
            {
             before(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__RisingAssignment_2_1"


    // $ANTLR start "rule__Calibration__FallingAssignment_3_1"
    // InternalDsl.g:7485:1: rule__Calibration__FallingAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Calibration__FallingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7489:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7490:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7490:2: ( ruleFLOAT )
            // InternalDsl.g:7491:3: ruleFLOAT
            {
             before(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__FallingAssignment_3_1"


    // $ANTLR start "rule__Dynamics__NameAssignment_1"
    // InternalDsl.g:7500:1: rule__Dynamics__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7504:1: ( ( RULE_ID ) )
            // InternalDsl.g:7505:2: ( RULE_ID )
            {
            // InternalDsl.g:7505:2: ( RULE_ID )
            // InternalDsl.g:7506:3: RULE_ID
            {
             before(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__NameAssignment_1"


    // $ANTLR start "rule__Dynamics__FrictionAssignment_2_1"
    // InternalDsl.g:7515:1: rule__Dynamics__FrictionAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__Dynamics__FrictionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7519:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7520:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7520:2: ( ruleFLOAT )
            // InternalDsl.g:7521:3: ruleFLOAT
            {
             before(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__FrictionAssignment_2_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_3_1"
    // InternalDsl.g:7530:1: rule__Dynamics__DampingAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Dynamics__DampingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7534:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7535:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7535:2: ( ruleFLOAT )
            // InternalDsl.g:7536:3: ruleFLOAT
            {
             before(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__DampingAssignment_3_1"


    // $ANTLR start "rule__Mimic__NameAssignment_0"
    // InternalDsl.g:7545:1: rule__Mimic__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mimic__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7549:1: ( ( RULE_ID ) )
            // InternalDsl.g:7550:2: ( RULE_ID )
            {
            // InternalDsl.g:7550:2: ( RULE_ID )
            // InternalDsl.g:7551:3: RULE_ID
            {
             before(grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__NameAssignment_0"


    // $ANTLR start "rule__Mimic__MimicsAssignment_2"
    // InternalDsl.g:7560:1: rule__Mimic__MimicsAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Mimic__MimicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7564:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:7565:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:7565:2: ( ( RULE_STRING ) )
            // InternalDsl.g:7566:3: ( RULE_STRING )
            {
             before(grammarAccess.getMimicAccess().getMimicsJointCrossReference_2_0()); 
            // InternalDsl.g:7567:3: ( RULE_STRING )
            // InternalDsl.g:7568:4: RULE_STRING
            {
             before(grammarAccess.getMimicAccess().getMimicsJointSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicsJointSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMimicAccess().getMimicsJointCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MimicsAssignment_2"


    // $ANTLR start "rule__Mimic__MultiplierAssignment_3_1"
    // InternalDsl.g:7579:1: rule__Mimic__MultiplierAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__Mimic__MultiplierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7583:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7584:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7584:2: ( ruleFLOAT )
            // InternalDsl.g:7585:3: ruleFLOAT
            {
             before(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MultiplierAssignment_3_1"


    // $ANTLR start "rule__Mimic__OffSetAssignment_4_1"
    // InternalDsl.g:7594:1: rule__Mimic__OffSetAssignment_4_1 : ( ruleFLOAT ) ;
    public final void rule__Mimic__OffSetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7598:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7599:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7599:2: ( ruleFLOAT )
            // InternalDsl.g:7600:3: ruleFLOAT
            {
             before(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__OffSetAssignment_4_1"


    // $ANTLR start "rule__SafetyController__NameAssignment_0"
    // InternalDsl.g:7609:1: rule__SafetyController__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7613:1: ( ( RULE_ID ) )
            // InternalDsl.g:7614:2: ( RULE_ID )
            {
            // InternalDsl.g:7614:2: ( RULE_ID )
            // InternalDsl.g:7615:3: RULE_ID
            {
             before(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__NameAssignment_0"


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_1_1"
    // InternalDsl.g:7624:1: rule__SafetyController__SoftLowerLimitAssignment_1_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7628:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7629:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7629:2: ( ruleFLOAT )
            // InternalDsl.g:7630:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_1_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_2_1"
    // InternalDsl.g:7639:1: rule__SafetyController__SoftUpperLimitAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7643:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7644:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7644:2: ( ruleFLOAT )
            // InternalDsl.g:7645:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_2_1"


    // $ANTLR start "rule__SafetyController__K_positionAssignment_3_1"
    // InternalDsl.g:7654:1: rule__SafetyController__K_positionAssignment_3_1 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__K_positionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7658:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7659:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7659:2: ( ruleFLOAT )
            // InternalDsl.g:7660:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_positionAssignment_3_1"


    // $ANTLR start "rule__SafetyController__K_velocityAssignment_5"
    // InternalDsl.g:7669:1: rule__SafetyController__K_velocityAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__SafetyController__K_velocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7673:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:7674:2: ( ruleFLOAT )
            {
            // InternalDsl.g:7674:2: ( ruleFLOAT )
            // InternalDsl.g:7675:3: ruleFLOAT
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_velocityAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000120020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000000000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L,0x000000000000F000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2A50000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004500000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}